# 小鹏访客系统概要设计

## 1. 数据建模

### 1.1 核心实体定义
```sql
/*访客信息表*/
t_visitor {
  visitor_id: bigint[PK]    // 访客ID  
  name: varchar(50)         // 姓名
  mobile: varchar(20)      // 手机号
  id_card: varchar(18)     // 身份证号
  face_photo: varchar(200) // 人脸照片
  status: tinyint          // 状态
  create_time: datetime    // 创建时间
  update_time: datetime    // 更新时间
}

/*预约记录表*/  
t_appointment {
  appointment_id: bigint[PK]  // 预约ID
  visitor_id: bigint[FK]      // 访客ID
  employee_id: bigint[FK]     // 被访人ID  
  visit_time: datetime        // 来访时间
  purpose: varchar(200)       // 来访事由
  status: tinyint            // 状态
  create_time: datetime      // 创建时间
  update_time: datetime      // 更新时间
}

/*访问记录表*/
t_visit_record {
  record_id: bigint[PK]      // 记录ID
  appointment_id: bigint[FK]  // 预约ID
  check_in_time: datetime    // 进入时间
  check_out_time: datetime   // 离开时间  
  pass_no: varchar(50)       // 访客证号
  status: tinyint           // 状态
  create_time: datetime     // 创建时间
  update_time: datetime     // 更新时间
}

/*员工信息表*/
t_employee {
  employee_id: bigint[PK]  // 员工ID
  name: varchar(50)        // 姓名
  department: varchar(50)  // 部门
  mobile: varchar(20)     // 手机号
  email: varchar(50)      // 邮箱
  status: tinyint         // 状态
  create_time: datetime   // 创建时间
  update_time: datetime   // 更新时间
}
```

### 1.2 实体关系图
```mermaid
erDiagram
    Visitor ||--o{ Appointment : submits
    Employee ||--o{ Appointment : receives  
    Appointment ||--o| VisitRecord : generates
    
    Visitor {
        bigint visitor_id
        string name
        string mobile
        string id_card
        string face_photo
        int status
    }
    
    Appointment {
        bigint appointment_id
        bigint visitor_id 
        bigint employee_id
        datetime visit_time
        string purpose
        int status
    }
    
    VisitRecord {
        bigint record_id
        bigint appointment_id
        datetime check_in_time
        datetime check_out_time
        string pass_no
        int status
    }
    
    Employee {
        bigint employee_id
        string name
        string department 
        string mobile
        string email
        int status
    }
```

## 2. 核心流程时序图

### 2.1 访客预约流程
```mermaid
sequenceDiagram
    actor Visitor as 访客
    participant System as 系统
    participant Employee as 被访人
    
    Visitor->>System: 1.提交预约申请
    System->>System: 2.验证访客信息
    System->>Employee: 3.发送预约通知
    Employee->>System: 4.审批预约
    System->>Visitor: 5.返回预约结果
    System->>System: 6.生成预约记录
```

### 2.2 访客登记流程  
```mermaid
sequenceDiagram
    actor Visitor as 访客
    participant Reception as 前台系统
    participant System as 核心系统
    
    Visitor->>Reception: 1.出示身份证
    Reception->>System: 2.读取身份信息
    System->>Reception: 3.返回预约信息
    Reception->>Visitor: 4.采集人脸照片
    Visitor->>Reception: 5.确认信息
    Reception->>System: 6.提交登记
    System->>Reception: 7.生成访客证
    Reception->>Visitor: 8.发放访客证
```

### 2.3 访客离场流程
```mermaid
sequenceDiagram
    actor Visitor as 访客
    participant Gate as 门禁系统
    participant System as 核心系统
    
    Visitor->>Gate: 1.刷访客证
    Gate->>System: 2.验证访客证
    System->>System: 3.记录离场时间
    System->>Gate: 4.允许通行
    Gate->>Visitor: 5.放行
```
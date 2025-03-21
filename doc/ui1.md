 # 咨询工单转交系统 UI 设计规范文档

| 文档信息 | |
|----------|---------|
| 作者 | 小军 |
| 最后更新日期 | 2025-03-21 |
| 文档状态 | 已完成 |

## 1. 设计系统规范

### 1.1 色彩规范
- 主色：#1890FF
- 辅助色：#52C41A
- 警示色：#FF4D4F
- 文字色：#262626
- 描边色：#D9D9D9
- 背景色：#F5F5F5

### 1.2 字体规范
- 标题：PingFang SC-Medium, 16px
- 正文：PingFang SC-Regular, 14px
- 辅助文字：PingFang SC-Regular, 12px

## 2. 界面设计

### 2.1 工单列表页

```svg
<svg width="800" height="600" xmlns="http://www.w3.org/2000/svg">
  <!-- 头部搜索区 -->
  <rect x="20" y="20" width="760" height="60" fill="#FFFFFF" stroke="#D9D9D9"/>
  <text x="40" y="55" font-family="PingFang SC" font-size="14" fill="#262626">工单号筛选</text>
  
  <!-- 表格头部 -->
  <rect x="20" y="100" width="760" height="40" fill="#FAFAFA" stroke="#D9D9D9"/>
  <text x="40" y="125" font-family="PingFang SC" font-size="14" fill="#262626">工单号</text>
  <text x="200" y="125" font-family="PingFang SC" font-size="14" fill="#262626">状态</text>
  <text x="360" y="125" font-family="PingFang SC" font-size="14" fill="#262626">处理人</text>
  <text x="520" y="125" font-family="PingFang SC" font-size="14" fill="#262626">操作</text>
  
  <!-- 表格内容 -->
  <rect x="20" y="140" width="760" height="50" fill="#FFFFFF" stroke="#D9D9D9"/>
  <text x="40" y="170" font-family="PingFang SC" font-size="14" fill="#262626">#001</text>
  <text x="200" y="170" font-family="PingFang SC" font-size="14" fill="#1890FF">处理中</text>
  <text x="360" y="170" font-family="PingFang SC" font-size="14" fill="#262626">张三</text>
  <rect x="520" y="155" width="60" height="24" rx="2" fill="#1890FF"/>
  <text x="532" y="172" font-family="PingFang SC" font-size="14" fill="#FFFFFF">详情</text>
</svg>
```

### 2.2 转交页面

```svg
<svg width="400" height="500" xmlns="http://www.w3.org/2000/svg">
  <!-- 转交弹窗 -->
  <rect x="0" y="0" width="400" height="500" fill="#FFFFFF" stroke="#D9D9D9"/>
  
  <!-- 标题 -->
  <text x="20" y="40" font-family="PingFang SC" font-size="16" fill="#262626">转交工单</text>
  
  <!-- 部门选择 -->
  <text x="20" y="80" font-family="PingFang SC" font-size="14" fill="#262626">选择部门</text>
  <rect x="20" y="100" width="360" height="36" fill="#FFFFFF" stroke="#D9D9D9"/>
  
  <!-- 人员选择 -->
  <text x="20" y="170" font-family="PingFang SC" font-size="14" fill="#262626">选择处理人</text>
  <rect x="20" y="190" width="360" height="160" fill="#FFFFFF" stroke="#D9D9D9"/>
  
  <!-- 转交原因 -->
  <text x="20" y="380" font-family="PingFang SC" font-size="14" fill="#262626">转交原因</text>
  <rect x="20" y="400" width="360" height="36" fill="#FFFFFF" stroke="#D9D9D9"/>
  
  <!-- 按钮组 -->
  <rect x="220" y="460" width="70" height="32" rx="2" fill="#FFFFFF" stroke="#D9D9D9"/>
  <text x="235" y="482" font-family="PingFang SC" font-size="14" fill="#262626">取消</text>
  
  <rect x="310" y="460" width="70" height="32" rx="2" fill="#1890FF"/>
  <text x="325" y="482" font-family="PingFang SC" font-size="14" fill="#FFFFFF">确认</text>
</svg>
```

## 3. 组件规范

### 3.1 按钮规范
- 主按钮：#1890FF
- 次按钮：#FFFFFF + #D9D9D9边框
- 按钮圆角：2px
- 按钮高度：32px

### 3.2 输入框规范
- 边框颜色：#D9D9D9
- 输入框高度：36px
- 内边距：12px

### 3.3 表格规范
- 表头背景：#FAFAFA
- 分割线：#D9D9D9
- 行高：50px

## 4. 响应式设计

- 最小宽度：1024px
- 内容区域：最大1200px
- 边距：左右各20px

## 5. 交互说明

### 5.1 列表页交互
- 悬停高亮：背景色变更为 #F5F5F5
- 点击行：可跳转详情
- 分页：每页默认20条

### 5.2 转交弹窗交互
- 弹窗宽度：400px
- 表单验证：必填项提示
- 确认按钮：loading状态

## 6. 设计资源

### 6.1 字体文件
- PingFang SC 系列

### 6.2 图标资源
- Ant Design 图标库
 # 咨询工单转交系统 UI 设计规范

| 文档信息 | |
|----------|---------|
| 作者 | 小军 |
| 最后更新日期 | 2025-03-21 |
| 文档状态 | 已完成 |

## 1. 设计规范

### 1.1 色彩规范
- 主色：#2B5AED
- 辅助色：#F5F7FA
- 文字色：#333333
- 边框色：#E5E7EB
- 警示色：#FF4D4F
- 成功色：#52C41A

### 1.2 字体规范
- 标题：PingFang SC Medium 16px
- 正文：PingFang SC Regular 14px
- 辅助文字：PingFang SC Regular 12px

### 1.3 布局规范
```svg
<svg width="800" height="600">
  <rect x="0" y="0" width="800" height="60" fill="#FFFFFF" stroke="#E5E7EB"/>
  <rect x="0" y="60" width="200" height="540" fill="#F5F7FA"/>
  <rect x="200" y="60" width="600" height="540" fill="#FFFFFF"/>
</svg>
```

## 2. 页面设计

### 2.1 工单列表页
```svg
<svg width="800" height="600">
  <!-- 顶部筛选区 -->
  <rect x="20" y="20" width="760" height="100" fill="#F5F7FA" rx="4"/>
  
  <!-- 列表区域 -->
  <rect x="20" y="140" width="760" height="440" fill="#FFFFFF" stroke="#E5E7EB"/>
  
  <!-- 分页区域 -->
  <rect x="20" y="540" width="760" height="40" fill="#FFFFFF"/>
</svg>
```

### 2.2 工单详情页
```svg
<svg width="800" height="600">
  <!-- 基本信息区 -->
  <rect x="20" y="20" width="760" height="160" fill="#FFFFFF" stroke="#E5E7EB"/>
  
  <!-- 处理记录区 -->
  <rect x="20" y="200" width="760" height="380" fill="#FFFFFF" stroke="#E5E7EB"/>
</svg>
```

### 2.3 转交弹窗
```svg
<svg width="400" height="500">
  <!-- 弹窗主体 -->
  <rect x="0" y="0" width="400" height="500" fill="#FFFFFF" rx="8"/>
  
  <!-- 选择区域 -->
  <rect x="20" y="60" width="360" height="360" fill="#F5F7FA"/>
  
  <!-- 按钮区域 -->
  <rect x="20" y="440" width="360" height="40" fill="#FFFFFF"/>
</svg>
```

## 3. 组件规范

### 3.1 按钮规范
- 主要按钮：#2B5AED
- 次要按钮：#FFFFFF，边框色 #E5E7EB
- 按钮圆角：4px
- 按钮高度：36px

### 3.2 表单规范
- 输入框高度：36px
- 输入框圆角：4px
- 标签文字：#666666
- 必填标记：#FF4D4F

### 3.3 表格规范
- 表头背景：#F5F7FA
- 分割线：#E5E7EB
- 行高：48px
- hover背景：#F5F7FA

## 4. 交互规范

### 4.1 加载状态
- Loading动效
- 骨架屏

### 4.2 反馈提示
- 成功提示
- 错误提示
- 确认弹窗

## 5. 响应式适配

### 5.1 断点设定
- 桌面端：≥1200px
- 平板端：≥768px
- 移动端：<768px

### 5.2 布局调整方案
- 弹性布局
- 栅格系统
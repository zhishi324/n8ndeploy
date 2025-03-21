 # 咨询工单转交系统 UI 设计规范

## 文档信息
- 作者：小军
- 最后更新日期：2025-03-21
- 文档状态：已评审

## 1. 设计系统

### 1.1 色彩系统
```svg
<svg width="400" height="60">
    <rect x="0" y="0" width="80" height="40" fill="#1890FF" />
    <text x="20" y="60" fill="black">主色</text>
    <rect x="100" y="0" width="80" height="40" fill="#52C41A" />
    <text x="110" y="60" fill="black">成功色</text>
    <rect x="200" y="0" width="80" height="40" fill="#FAAD14" />
    <text x="210" y="60" fill="black">警告色</text>
    <rect x="300" y="0" width="80" height="40" fill="#FF4D4F" />
    <text x="310" y="60" fill="black">错误色</text>
</svg>
```

### 1.2 字体规范
- 标题: Helvetica Neue, 18px, Bold
- 正文: PingFang SC, 14px, Regular
- 次要文字: PingFang SC, 12px, Regular

### 1.3 间距规范
- 内边距: 16px/24px
- 外边距: 16px/24px
- 组件间距: 24px

## 2. 界面设计

### 2.1 工单列表页
```svg
<svg width="800" height="600">
    <rect x="0" y="0" width="800" height="600" fill="#F0F2F5"/>
    <!-- 顶部导航 -->
    <rect x="0" y="0" width="800" height="64" fill="#FFFFFF"/>
    <!-- 搜索区域 -->
    <rect x="24" y="88" width="752" height="56" fill="#FFFFFF"/>
    <!-- 列表区域 -->
    <rect x="24" y="160" width="752" height="420" fill="#FFFFFF"/>
</svg>
```

### 2.2 工单转交弹窗
```svg
<svg width="400" height="300">
    <rect x="0" y="0" width="400" height="300" fill="#FFFFFF"/>
    <!-- 标题区 -->
    <rect x="0" y="0" width="400" height="48" fill="#F7F7F7"/>
    <!-- 表单区 -->
    <rect x="24" y="72" width="352" height="180" fill="#FFFFFF"/>
    <!-- 按钮区 -->
    <rect x="0" y="252" width="400" height="48" fill="#F7F7F7"/>
</svg>
```

## 3. 组件规范

### 3.1 按钮规范
- 主按钮: 蓝色填充 (#1890FF)
- 次按钮: 白色描边
- 高度: 32px
- 圆角: 2px

### 3.2 输入框规范
- 高度: 32px
- 内边距: 8px 12px
- 边框颜色: #D9D9D9
- 圆角: 2px

### 3.3 表格规范
- 行高: 54px
- 表头背景: #FAFAFA
- 分割线颜色: #F0F0F0

## 4. 响应式设计

### 4.1 断点设定
- 移动端: <768px
- 平板: 768px~1024px
- 桌面: >1024px

### 4.2 布局适配
- 移动端: 单列布局
- 平板: 双列布局
- 桌面: 三列布局

## 5. 交互规范

### 5.1 加载状态
- 列表加载: 骨架屏
- 提交操作: 按钮loading
- 页面切换: 顶部进度条

### 5.2 反馈机制
- 成功提示: 绿色轻提示
- 警告提示: 黄色轻提示
- 错误提示: 红色轻提示
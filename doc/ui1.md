 # UI设计规范文档

## 文档信息
- 设计师：小军
- 最后更新日期：2025-03-21

## 1. 布局规范

### 1.1 页面框架
```svg
<svg width="800" height="600">
  <rect x="0" y="0" width="800" height="80" fill="#f5f5f5"/>
  <rect x="0" y="80" width="800" height="440" fill="#ffffff"/>
  <rect x="0" y="520" width="800" height="80" fill="#f5f5f5"/>
  <text x="370" y="45" font-family="Arial" font-size="16">Header</text>
  <text x="370" y="300" font-family="Arial" font-size="16">Main Content</text>
  <text x="370" y="560" font-family="Arial" font-size="16">Footer</text>
</svg>
```

### 1.2 网格系统
- 页面宽度：1200px
- 列数：12列
- 列间距：20px
- 边距：30px

## 2. 设计元素

### 2.1 色彩规范
- 主色：#2196F3
- 辅助色：#FF4081
- 背景色：#FFFFFF
- 文字色：#333333
- 边框色：#E0E0E0

### 2.2 字体规范
- 主标题：24px
- 副标题：20px
- 正文：16px
- 辅助文本：14px
- 字体族：系统默认字体

### 2.3 组件规范

#### 按钮
```svg
<svg width="400" height="120">
  <rect x="20" y="20" width="100" height="36" rx="4" fill="#2196F3"/>
  <text x="45" y="43" font-family="Arial" font-size="14" fill="white">主按钮</text>
  
  <rect x="140" y="20" width="100" height="36" rx="4" fill="#ffffff" stroke="#2196F3"/>
  <text x="165" y="43" font-family="Arial" font-size="14" fill="#2196F3">次按钮</text>
  
  <rect x="260" y="20" width="100" height="36" rx="4" fill="#f5f5f5"/>
  <text x="285" y="43" font-family="Arial" font-size="14" fill="#666666">禁用</text>
</svg>
```

#### 输入框
```svg
<svg width="400" height="60">
  <rect x="20" y="10" width="360" height="40" rx="4" fill="white" stroke="#E0E0E0"/>
  <text x="35" y="35" font-family="Arial" font-size="14" fill="#999999">请输入...</text>
</svg>
```

## 3. 响应式设计

### 3.1 断点设置
- 移动端：< 768px
- 平板：768px - 1024px
- 桌面端：> 1024px

### 3.2 适配原则
- 移动优先
- 弹性布局
- 内容优先级排序

## 4. 交互规范

### 4.1 状态反馈
- 悬浮：透明度80%
- 点击：透明度60%
- 加载：显示loading动画
- 错误：红色提示

### 4.2 动画效果
- 过渡时长：0.3s
- 缓动函数：ease-in-out
- 动画范围：位置、透明度、缩放

## 5. 无障碍设计
- 适当的颜色对比度
- 键盘可访问性
- 屏幕阅读器支持
- 焦点状态明确

## 6. 设计资源
- 图标库：Material Icons
- 图片规范：2x图，支持WebP格式
- 设计源文件：Sketch/Figma格式
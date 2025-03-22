 # 咨询工单转交系统 UI 设计方案

## 1. 系统整体布局

@{layout}.svg
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">
<svg width="1440" height="900">
  <!-- 顶部导航栏 -->
  <rect x="0" y="0" width="1440" height="64" fill="#1890FF"/>
  <!-- 左侧菜单栏 -->
  <rect x="0" y="64" width="256" height="836" fill="#FFFFFF"/>
  <!-- 主要内容区域 -->
  <rect x="256" y="64" width="1184" height="836" fill="#F0F2F5"/>
</svg>

## 2. 工单列表页

@{workorder-list}.svg
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">
<svg width="1184" height="800">
  <!-- 搜索过滤区 -->
  <rect x="24" y="24" width="1136" height="64" fill="#FFFFFF"/>
  <!-- 工单列表表格 -->
  <rect x="24" y="104" width="1136" height="672" fill="#FFFFFF"/>
</svg>

## 3. 工单详情页

@{workorder-detail}.svg
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">
<svg width="1184" height="800">
  <!-- 工单基本信息 -->
  <rect x="24" y="24" width="1136" height="160" fill="#FFFFFF"/>
  <!-- 处理记录 -->
  <rect x="24" y="200" width="752" height="576" fill="#FFFFFF"/>
  <!-- 操作区域 -->
  <rect x="792" y="200" width="368" height="576" fill="#FFFFFF"/>
</svg>

## 4. 数据统计页

@{statistics}.svg
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">
<svg width="1184" height="800">
  <!-- 统计卡片 -->
  <rect x="24" y="24" width="272" height="120" fill="#FFFFFF"/>
  <rect x="312" y="24" width="272" height="120" fill="#FFFFFF"/>
  <rect x="600" y="24" width="272" height="120" fill="#FFFFFF"/>
  <rect x="888" y="24" width="272" height="120" fill="#FFFFFF"/>
  <!-- 图表区域 -->
  <rect x="24" y="160" width="1136" height="616" fill="#FFFFFF"/>
</svg>

## 5. 工单转交弹窗

@{transfer-modal}.svg
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">
<svg width="520" height="400">
  <!-- 弹窗容器 -->
  <rect x="0" y="0" width="520" height="400" fill="#FFFFFF"/>
  <!-- 表单区域 -->
  <rect x="24" y="64" width="472" height="272" fill="#F7F9FC"/>
</svg>

## 色彩方案

- 主色：#1890FF
- 背景色：#F0F2F5
- 文字主色：#000000D9
- 成功色：#52C41A
- 警告色：#FAAD14
- 错误色：#FF4D4F

## 字体规范

- 标题：16px
- 正文：14px
- 辅助文字：12px
- 字体系列：-apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto

## 组件规范

- 按钮高度：32px
- 输入框高度：32px
- 表格行高：54px
- 间距系统：8px 的倍数
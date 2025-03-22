 # 咨询工单转交系统 UI 设计方案

## 1. 系统整体布局

<details>
```
@layout.svg
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">
<svg width="1440" height="900">
  <rect x="0" y="0" width="240" height="900" fill="#001529"/>
  <rect x="0" y="0" width="1440" height="64" fill="#FFFFFF"/>
  <rect x="240" y="64" width="1200" height="836" fill="#F0F2F5"/>
</svg>
@layout.svg
```
</details>

## 2. 工单列表页

<details>
```
@ticket-list.svg
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">
<svg width="1160" height="800">
  <rect x="20" y="20" width="1120" height="760" fill="#FFFFFF" rx="2"/>
  <rect x="40" y="40" width="1080" height="50" fill="#FAFAFA"/>
  <!-- 搜索栏 -->
  <rect x="40" y="110" width="1080" height="600" fill="#FFFFFF"/>
  <!-- 表格内容 -->
</svg>
@ticket-list.svg
```
</details>

## 3. 工单转交弹窗

<details>
```
@transfer-modal.svg
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">
<svg width="520" height="400">
  <rect x="0" y="0" width="520" height="400" fill="#FFFFFF" rx="2"/>
  <rect x="0" y="0" width="520" height="55" fill="#FAFAFA"/>
  <!-- 表单内容 -->
</svg>
@transfer-modal.svg
```
</details>

## 4. 工单详情页

<details>
```
@ticket-detail.svg
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">
<svg width="1160" height="800">
  <rect x="20" y="20" width="720" height="760" fill="#FFFFFF" rx="2"/>
  <rect x="760" y="20" width="380" height="760" fill="#FFFFFF" rx="2"/>
</svg>
@ticket-detail.svg
```
</details>

## 5. 设置页面

<details>
```
@settings.svg
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE svg PUBLIC "-//W3C//DTD SVG 1.1//EN" "http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd">
<svg width="1160" height="800">
  <rect x="20" y="20" width="240" height="760" fill="#FFFFFF" rx="2"/>
  <rect x="280" y="20" width="860" height="760" fill="#FFFFFF" rx="2"/>
</svg>
@settings.svg
```
</details>

## 6. 颜色规范

- 主色：#1890FF
- 成功色：#52C41A
- 警告色：#FAAD14
- 错误色：#F5222D
- 中性色：#000000、#FFFFFF、#F0F2F5

## 7. 组件规范

- 字体：
  - 标题：16px
  - 正文：14px
  - 辅助文字：12px
  
- 间距：
  - 内边距：24px
  - 外边距：16px
  - 组件间距：8px

- 圆角：
  - 大圆角：4px
  - 小圆角：2px
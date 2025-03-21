 # 咨询工单转交系统 UI 设计规范文档

| 文档信息 | |
|----------|---------|
| 作者 | 小军 |
| 最后更新日期 | 2025-03-21 |
| 文档状态 | 已完成 |

## 1. 设计规范

### 1.1 色彩规范

```svg
<svg width="400" height="60">
  <rect x="10" y="10" width="60" height="40" fill="#1890FF" />
  <text x="80" y="35" fill="black">主色 #1890FF</text>
  <rect x="160" y="10" width="60" height="40" fill="#52C41A" />
  <text x="230" y="35" fill="black">成功 #52C41A</text>
  <rect x="310" y="10" width="60" height="40" fill="#FF4D4F" />
  <text x="380" y="35" fill="black">警告 #FF4D4F</text>
</svg>
```

### 1.2 字体规范
- 标题: PingFang SC, 16px, Bold
- 正文: PingFang SC, 14px, Regular
- 说明文本: PingFang SC, 12px, Regular

## 2. 页面布局

### 2.1 工单列表页

```svg
<svg width="800" height="600">
  <rect x="0" y="0" width="800" height="60" fill="#FFFFFF" />
  <rect x="20" y="15" width="760" height="30" fill="#F5F5F5" />
  <text x="30" y="35" fill="#333333">筛选条件</text>
  
  <rect x="0" y="70" width="800" height="530" fill="#FFFFFF" />
  <rect x="20" y="90" width="760" height="40" fill="#FAFAFA" />
  <text x="30" y="115" fill="#333333">工单列表</text>
  
  <rect x="20" y="140" width="760" height="450" fill="#FFFFFF" stroke="#E8E8E8" />
</svg>
```

### 2.2 工单转交页

```svg
<svg width="500" height="400">
  <rect x="0" y="0" width="500" height="400" fill="#FFFFFF" />
  <rect x="20" y="20" width="460" height="360" fill="#FFFFFF" stroke="#E8E8E8" />
  
  <text x="40" y="60" fill="#333333">选择转交人</text>
  <rect x="40" y="80" width="420" height="40" fill="#F5F5F5" />
  
  <text x="40" y="160" fill="#333333">转交原因</text>
  <rect x="40" y="180" width="420" height="100" fill="#F5F5F5" />
  
  <rect x="280" y="320" width="80" height="32" fill="#1890FF" rx="4" />
  <text x="300" y="342" fill="#FFFFFF">确认</text>
  
  <rect x="380" y="320" width="80" height="32" fill="#F5F5F5" rx="4" />
  <text x="400" y="342" fill="#333333">取消</text>
</svg>
```

## 3. 交互组件

### 3.1 按钮样式

```svg
<svg width="400" height="40">
  <rect x="10" y="5" width="80" height="32" fill="#1890FF" rx="4" />
  <text x="30" y="27" fill="#FFFFFF">主按钮</text>
  
  <rect x="110" y="5" width="80" height="32" fill="#FFFFFF" stroke="#1890FF" rx="4" />
  <text x="130" y="27" fill="#1890FF">次按钮</text>
  
  <rect x="210" y="5" width="80" height="32" fill="#F5F5F5" rx="4" />
  <text x="230" y="27" fill="#333333">普通</text>
</svg>
```

### 3.2 表单控件

```svg
<svg width="400" height="120">
  <rect x="10" y="10" width="380" height="32" fill="#FFFFFF" stroke="#D9D9D9" rx="4" />
  <text x="20" y="30" fill="#333333">输入框</text>
  
  <rect x="10" y="50" width="380" height="32" fill="#FFFFFF" stroke="#D9D9D9" rx="4" />
  <text x="20" y="70" fill="#BFBFBF">下拉选择框</text>
  
  <rect x="10" y="90" width="380" height="20" fill="#FFFFFF" />
  <circle cx="20" cy="100" r="8" fill="#1890FF" />
  <text x="40" y="105" fill="#333333">单选框</text>
</svg>
```

## 4. 响应式设计

- 桌面端最小宽度: 1280px
- 平板端最小宽度: 768px
- 移动端最小宽度: 375px

## 5. 组件状态

### 5.1 Loading 状态

```svg
<svg width="200" height="100">
  <circle cx="100" cy="50" r="20" fill="none" stroke="#1890FF" stroke-width="4">
    <animateTransform
      attributeName="transform"
      type="rotate"
      from="0 100 50"
      to="360 100 50"
      dur="1s"
      repeatCount="indefinite"/>
  </circle>
</svg>
```

### 5.2 空状态

```svg
<svg width="200" height="200">
  <rect x="50" y="50" width="100" height="100" fill="#F5F5F5" />
  <text x="70" y="110" fill="#999999">暂无数据</text>
</svg>
```
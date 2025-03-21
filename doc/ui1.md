 # 咨询工单转交系统 UI 设计规范

| 文档信息 | |
|----------|---------|
| 作者 | 小军 |
| 最后更新日期 | 2025-03-21 |
| 文档状态 | 已完成 |

## 1. 设计规范

### 1.1 色彩规范

```svg
<svg width="400" height="100">
  <rect x="10" y="10" width="80" height="40" fill="#1890FF" />
  <text x="100" y="35" fill="black">主色 #1890FF</text>
  <rect x="10" y="60" width="80" height="40" fill="#F5222D" />
  <text x="100" y="85" fill="black">错误色 #F5222D</text>
</svg>
```

### 1.2 字体规范

- 标题：PingFang SC, 16px, Bold
- 正文：PingFang SC, 14px, Regular
- 次要文字：PingFang SC, 12px, Regular

## 2. 界面设计

### 2.1 工单列表页

```svg
<svg width="800" height="600">
  <rect x="0" y="0" width="800" height="60" fill="#FFFFFF" stroke="#E8E8E8"/>
  <text x="20" y="35" fill="#000000">工单列表</text>
  
  <!-- 搜索区域 -->
  <rect x="20" y="80" width="760" height="50" fill="#F5F5F5" rx="4"/>
  <rect x="30" y="90" width="200" height="30" fill="#FFFFFF" stroke="#D9D9D9"/>
  
  <!-- 表格头部 -->
  <rect x="20" y="150" width="760" height="40" fill="#FAFAFA"/>
  <text x="40" y="175" fill="#000000">工单号</text>
  <text x="200" y="175" fill="#000000">状态</text>
  <text x="360" y="175" fill="#000000">处理人</text>
  <text x="520" y="175" fill="#000000">操作</text>
</svg>
```

### 2.2 工单转交页

```svg
<svg width="500" height="400">
  <rect x="0" y="0" width="500" height="400" fill="#FFFFFF" stroke="#E8E8E8"/>
  <text x="20" y="30" fill="#000000" font-size="16">转交工单</text>
  
  <!-- 表单区域 -->
  <text x="20" y="80" fill="#000000">选择部门</text>
  <rect x="20" y="90" width="460" height="40" fill="#FFFFFF" stroke="#D9D9D9"/>
  
  <text x="20" y="160" fill="#000000">选择处理人</text>
  <rect x="20" y="170" width="460" height="40" fill="#FFFFFF" stroke="#D9D9D9"/>
  
  <text x="20" y="240" fill="#000000">转交原因</text>
  <rect x="20" y="250" width="460" height="80" fill="#FFFFFF" stroke="#D9D9D9"/>
  
  <!-- 按钮区域 -->
  <rect x="20" y="350" width="100" height="32" fill="#FFFFFF" stroke="#D9D9D9"/>
  <text x="50" y="370" fill="#000000">取消</text>
  <rect x="380" y="350" width="100" height="32" fill="#1890FF"/>
  <text x="400" y="370" fill="#FFFFFF">确认转交</text>
</svg>
```

## 3. 组件规范

### 3.1 按钮样式

```svg
<svg width="400" height="120">
  <rect x="10" y="10" width="100" height="32" fill="#1890FF" rx="4"/>
  <text x="35" y="30" fill="#FFFFFF">主按钮</text>
  
  <rect x="120" y="10" width="100" height="32" fill="#FFFFFF" stroke="#D9D9D9" rx="4"/>
  <text x="145" y="30" fill="#000000">次按钮</text>
  
  <rect x="230" y="10" width="100" height="32" fill="#F5222D" rx="4"/>
  <text x="255" y="30" fill="#FFFFFF">警示按钮</text>
</svg>
```

### 3.2 表单组件

```svg
<svg width="400" height="200">
  <rect x="10" y="10" width="380" height="40" fill="#FFFFFF" stroke="#D9D9D9"/>
  <text x="20" y="35" fill="#BFBFBF">输入框</text>
  
  <rect x="10" y="60" width="380" height="40" fill="#FFFFFF" stroke="#D9D9D9"/>
  <text x="20" y="85" fill="#BFBFBF">下拉选择框</text>
  
  <rect x="10" y="110" width="380" height="80" fill="#FFFFFF" stroke="#D9D9D9"/>
  <text x="20" y="135" fill="#BFBFBF">文本域</text>
</svg>
```

## 4. 响应式设计

- 桌面端最小宽度：1280px
- 平板端最小宽度：768px
- 移动端最小宽度：375px

## 5. 交互规范

### 5.1 加载状态

```svg
<svg width="400" height="100">
  <circle cx="50" cy="50" r="20" fill="none" stroke="#1890FF" stroke-width="4">
    <animateTransform attributeName="transform" type="rotate" from="0 50 50" to="360 50 50" dur="1s" repeatCount="indefinite"/>
  </circle>
  <text x="100" y="55" fill="#000000">加载中...</text>
</svg>
```

### 5.2 操作反馈

```svg
<svg width="400" height="100">
  <rect x="10" y="10" width="380" height="40" fill="#F6FFED" stroke="#B7EB8F"/>
  <text x="30" y="35" fill="#52C41A">操作成功提示</text>
  
  <rect x="10" y="60" width="380" height="40" fill="#FFF2F0" stroke="#FFCCC7"/>
  <text x="30" y="85" fill="#F5222D">操作失败提示</text>
</svg>
```
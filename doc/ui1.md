 # 咨询工单转交系统UI设计规范

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
  <text x="100" y="35" fill="#333">主色 #1890FF</text>
  <rect x="10" y="60" width="80" height="40" fill="#F5F5F5" />
  <text x="100" y="85" fill="#333">背景色 #F5F5F5</text>
  <rect x="200" y="10" width="80" height="40" fill="#52C41A" />
  <text x="290" y="35" fill="#333">成功 #52C41A</text>
  <rect x="200" y="60" width="80" height="40" fill="#FF4D4F" />
  <text x="290" y="85" fill="#333">错误 #FF4D4F</text>
</svg>
```

### 1.2 字体规范
- 主标题: 18px, 加粗
- 副标题: 16px, 常规
- 正文: 14px, 常规
- 辅助文字: 12px, 常规

## 2. 页面布局

### 2.1 工单列表页
```svg
<svg width="800" height="600">
  <rect x="0" y="0" width="800" height="60" fill="#FFFFFF"/>
  <rect x="20" y="80" width="760" height="60" fill="#F5F5F5"/>
  <rect x="20" y="160" width="760" height="400" fill="#FFFFFF"/>
  
  <!-- 顶部导航 -->
  <text x="40" y="35" fill="#333333" font-size="16">工单管理系统</text>
  
  <!-- 搜索筛选区 -->
  <rect x="40" y="95" width="200" height="30" fill="#FFFFFF" stroke="#D9D9D9"/>
  <text x="50" y="115" fill="#999999" font-size="14">搜索工单号...</text>
  
  <!-- 列表内容 -->
  <rect x="40" y="180" width="720" height="50" fill="#FAFAFA"/>
  <text x="60" y="210" fill="#333333" font-size="14">工单号</text>
  <text x="200" y="210" fill="#333333" font-size="14">状态</text>
  <text x="340" y="210" fill="#333333" font-size="14">处理人</text>
  <text x="480" y="210" fill="#333333" font-size="14">操作</text>
</svg>
```

### 2.2 工单转交弹窗
```svg
<svg width="500" height="400">
  <rect x="0" y="0" width="500" height="400" fill="#FFFFFF" stroke="#D9D9D9"/>
  
  <!-- 标题 -->
  <text x="20" y="40" fill="#333333" font-size="16" font-weight="bold">工单转交</text>
  
  <!-- 表单内容 -->
  <text x="20" y="80" fill="#333333" font-size="14">选择部门</text>
  <rect x="20" y="90" width="460" height="40" fill="#FFFFFF" stroke="#D9D9D9"/>
  
  <text x="20" y="160" fill="#333333" font-size="14">选择处理人</text>
  <rect x="20" y="170" width="460" height="40" fill="#FFFFFF" stroke="#D9D9D9"/>
  
  <text x="20" y="240" fill="#333333" font-size="14">转交原因</text>
  <rect x="20" y="250" width="460" height="80" fill="#FFFFFF" stroke="#D9D9D9"/>
  
  <!-- 按钮 -->
  <rect x="280" y="350" width="90" height="32" fill="#FFFFFF" stroke="#D9D9D9"/>
  <text x="310" y="370" fill="#333333" font-size="14">取消</text>
  
  <rect x="390" y="350" width="90" height="32" fill="#1890FF"/>
  <text x="415" y="370" fill="#FFFFFF" font-size="14">确认</text>
</svg>
```

## 3. 组件规范

### 3.1 按钮样式
```svg
<svg width="400" height="100">
  <rect x="20" y="20" width="80" height="32" fill="#1890FF"/>
  <text x="40" y="40" fill="#FFFFFF" font-size="14">主按钮</text>
  
  <rect x="120" y="20" width="80" height="32" fill="#FFFFFF" stroke="#D9D9D9"/>
  <text x="140" y="40" fill="#333333" font-size="14">次按钮</text>
  
  <rect x="220" y="20" width="80" height="32" fill="#FF4D4F"/>
  <text x="240" y="40" fill="#FFFFFF" font-size="14">警示按钮</text>
</svg>
```

### 3.2 表单组件
```svg
<svg width="400" height="200">
  <rect x="20" y="20" width="360" height="40" fill="#FFFFFF" stroke="#D9D9D9"/>
  <text x="30" y="45" fill="#999999" font-size="14">输入框</text>
  
  <rect x="20" y="80" width="360" height="40" fill="#FFFFFF" stroke="#D9D9D9"/>
  <text x="30" y="105" fill="#333333" font-size="14">下拉选择框</text>
  
  <rect x="20" y="140" width="360" height="40" fill="#FFFFFF" stroke="#D9D9D9"/>
  <text x="30" y="165" fill="#333333" font-size="14">日期选择器</text>
</svg>
```

## 4. 响应式设计

- 桌面端：≥1200px
- 平板端：≥768px
- 移动端：<768px

## 5. 交互规范

### 5.1 状态反馈
- 加载中：显示loading动画
- 成功提示：绿色提示框，2秒后消失
- 错误提示：红色提示框，需手动关闭

### 5.2 操作反馈
- 按钮点击效果：透明度变化
- 悬浮提示：浅色背景tooltip
- 表单验证：红色错误提示
 # 咨询工单转交系统UI设计稿

## 文档信息
- 作者：小军
- 最后更新日期：2025-03-21
- 文档状态：初稿

## 1. 核心功能界面设计

### 1.1 工单创建界面
<svg width="400" height="300" xmlns="http://www.w3.org/2000/svg">
    <rect x="10" y="10" width="380" height="280" fill="white" stroke="#ccc"/>
    <text x="150" y="40" font-size="16">工单创建</text>
    <rect x="30" y="60" width="340" height="40" fill="#f5f5f5" rx="4"/>
    <text x="40" y="85">工单标题</text>
    <rect x="30" y="110" width="340" height="40" fill="#f5f5f5" rx="4"/>
    <text x="40" y="135">客户信息</text>
    <rect x="30" y="160" width="340" height="60" fill="#f5f5f5" rx="4"/>
    <text x="40" y="185">问题描述</text>
    <rect x="30" y="230" width="160" height="30" fill="#f5f5f5" rx="4"/>
    <text x="40" y="250">优先级</text>
    <rect x="220" y="230" width="70" height="30" fill="#1890ff" rx="4"/>
    <text x="235" y="250" fill="white">提交</text>
    <rect x="300" y="230" width="70" height="30" fill="white" stroke="#ccc" rx="4"/>
    <text x="315" y="250">取消</text>
</svg>

### 1.2 工单转交界面
<svg width="400" height="300" xmlns="http://www.w3.org/2000/svg">
    <rect x="10" y="10" width="380" height="280" fill="white" stroke="#ccc"/>
    <text x="150" y="40" font-size="16">工单转交</text>
    <rect x="30" y="60" width="340" height="40" fill="#f5f5f5" rx="4"/>
    <text x="40" y="85">选择部门</text>
    <rect x="30" y="110" width="340" height="40" fill="#f5f5f5" rx="4"/>
    <text x="40" y="135">选择处理人</text>
    <rect x="30" y="160" width="340" height="60" fill="#f5f5f5" rx="4"/>
    <text x="40" y="185">转交原因</text>
    <rect x="220" y="230" width="70" height="30" fill="#1890ff" rx="4"/>
    <text x="235" y="250" fill="white">确认</text>
    <rect x="300" y="230" width="70" height="30" fill="white" stroke="#ccc" rx="4"/>
    <text x="315" y="250">取消</text>
</svg>

### 1.3 工单列表界面
<svg width="400" height="300" xmlns="http://www.w3.org/2000/svg">
    <rect x="10" y="10" width="380" height="280" fill="white" stroke="#ccc"/>
    <text x="150" y="40" font-size="16">工单列表</text>
    <rect x="30" y="60" width="340" height="200" fill="#f5f5f5" rx="4"/>
    <line x1="30" y1="100" x2="370" y2="100" stroke="#ccc"/>
    <text x="40" y="85">工单编号</text>
    <text x="120" y="85">标题</text>
    <text x="200" y="85">状态</text>
    <text x="280" y="85">处理人</text>
    <text x="340" y="85">操作</text>
</svg>

## 2. 交互说明

### 2.1 颜色规范
- 主色：#1890ff
- 背景色：#f5f5f5
- 边框色：#cccccc
- 文字色：#000000

### 2.2 字体规范
- 标题：16px
- 正文：14px
- 按钮文字：14px

### 2.3 间距规范
- 页面边距：20px
- 组件间距：10px
- 内边距：15px

## 3. 响应式设计
- 桌面端最小宽度：1024px
- 平板端最小宽度：768px
- 移动端最小宽度：375px

## 4. 交互状态

### 4.1 按钮状态
- 默认状态
- 悬停状态
- 点击状态
- 禁用状态

### 4.2 表单验证
- 必填项提示
- 错误提示
- 成功提示

## 5. 辅助功能
- 键盘快捷键
- 页面帮助提示
- 加载状态提示
- 操作确认提示
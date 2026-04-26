# 个人作品集网站

基于 React + TypeScript + Tailwind CSS 开发的现代化个人作品集网站。

## 技术栈

- React 18
- TypeScript
- Vite
- Tailwind CSS
- Framer Motion（动画效果）
- React Router（可选）

## 快速开始

### 安装依赖

```bash
cd portfolio
npm install
```

### 开发模式

```bash
npm run dev
```

访问 http://localhost:5173 查看应用。

### 构建生产版本

```bash
npm run build
```

### 预览生产构建

```bash
npm run preview
```

## 项目结构

```
portfolio/
├── src/
│   ├── components/        # React 组件
│   │   ├── Header.tsx     # 导航栏
│   │   ├── Hero.tsx       # 首页英雄区域
│   │   ├── About.tsx      # 关于我
│   │   ├── Projects.tsx   # 项目展示
│   │   ├── Contact.tsx    # 联系方式
│   │   └── Footer.tsx     # 页脚
│   ├── data/              # 数据文件
│   │   ├── projects.ts    # 项目数据
│   │   └── skills.ts      # 技能数据
│   ├── App.tsx            # 主应用组件
│   ├── main.tsx           # 入口文件
│   └── index.css          # 全局样式
├── index.html
├── package.json
├── tailwind.config.js     # Tailwind 配置
├── postcss.config.js      # PostCSS 配置
├── vite.config.ts         # Vite 配置
└── tsconfig.json          # TypeScript 配置
```

## 自定义内容

### 修改个人信息

1. **Hero 组件** (`src/components/Hero.tsx`)
   - 修改姓名和简介
   - 替换头像图片

2. **About 组件** (`src/components/About.tsx`)
   - 更新个人介绍

3. **数据文件**
   - `src/data/projects.ts` - 修改项目信息
   - `src/data/skills.ts` - 修改技能列表

4. **Contact 组件** (`src/components/Contact.tsx`)
   - 更新邮箱、GitHub、LinkedIn 等联系方式

### 修改主题色

编辑 `tailwind.config.js` 中的颜色配置：

```javascript
theme: {
  extend: {
    colors: {
      background: '#0a0a0a',  // 背景色
      foreground: '#ffffff',  // 文字色
    },
  },
}
```

## 特性

- ✅ 深色主题设计
- ✅ 流畅的滚动动画
- ✅ 响应式布局（移动端适配）
- ✅ 渐变色强调效果
- ✅ 图片懒加载
- ✅ 平滑滚动
- ✅ 模块化组件设计

## 注意事项

- 所有链接都已设置为可点击
- 图片使用了占位符，请替换为实际图片
- 联系表单目前仅为前端展示，需要添加后端支持才能真正发送消息

## License

MIT

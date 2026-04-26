// 项目数据
export interface Project {
  id: number;
  name: string;
  description: string;
  image: string;
  techStack: string[];
  link: string;
}

export const projects: Project[] = [
  {
    id: 1,
    name: "个人博客系统",
    description: "基于 React 和 Node.js 开发的个人博客平台，支持文章发布、评论和分类管理",
    image: "https://via.placeholder.com/600x400",
    techStack: ["React", "Node.js", "MongoDB", "Express"],
    link: "https://github.com/yourusername/blog"
  },
  {
    id: 2,
    name: "任务管理应用",
    description: "一款简洁高效的任务管理工具，支持待办事项、提醒和团队协作功能",
    image: "https://via.placeholder.com/600x400",
    techStack: ["Vue.js", "TypeScript", "Firebase"],
    link: "https://github.com/yourusername/task-manager"
  },
  {
    id: 3,
    name: "电商网站",
    description: "全栈电商解决方案，包含商品展示、购物车、支付和用户管理系统",
    image: "https://via.placeholder.com/600x400",
    techStack: ["Next.js", "Tailwind CSS", "Stripe", "PostgreSQL"],
    link: "https://github.com/yourusername/ecommerce"
  },
  {
    id: 4,
    name: "天气预报应用",
    description: "实时天气查询应用，提供未来7天天气预报和空气质量指数",
    image: "https://via.placeholder.com/600x400",
    techStack: ["React Native", "OpenWeather API", "Redux"],
    link: "https://github.com/yourusername/weather-app"
  }
];

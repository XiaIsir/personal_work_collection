// 技能数据
export interface Skill {
  name: string;
  level: number; // 1-5
  category: string;
}

export const skills: Skill[] = [
  // 前端技能
  { name: "React", level: 5, category: "前端" },
  { name: "TypeScript", level: 5, category: "前端" },
  { name: "JavaScript", level: 5, category: "前端" },
  { name: "HTML/CSS", level: 5, category: "前端" },
  { name: "Tailwind CSS", level: 4, category: "前端" },
  { name: "Vue.js", level: 4, category: "前端" },
  { name: "Next.js", level: 4, category: "前端" },
  
  // 后端技能
  { name: "Node.js", level: 4, category: "后端" },
  { name: "Express", level: 4, category: "后端" },
  { name: "Python", level: 3, category: "后端" },
  { name: "Java", level: 3, category: "后端" },
  
  // 数据库
  { name: "MongoDB", level: 4, category: "数据库" },
  { name: "PostgreSQL", level: 3, category: "数据库" },
  { name: "MySQL", level: 3, category: "数据库" },
  
  // 工具和其他
  { name: "Git", level: 5, category: "工具" },
  { name: "Docker", level: 3, category: "工具" },
  { name: "Figma", level: 3, category: "设计" },
];

import { motion } from 'framer-motion';
import { skills } from '../data/skills';

const About = () => {
  // 按类别分组技能
  const skillsByCategory = skills.reduce((acc, skill) => {
    if (!acc[skill.category]) {
      acc[skill.category] = [];
    }
    acc[skill.category].push(skill);
    return acc;
  }, {} as Record<string, typeof skills>);

  return (
    <section id="about" className="py-20">
      <div className="container mx-auto px-6">
        <motion.div
          initial={{ opacity: 0, y: 50 }}
          whileInView={{ opacity: 1, y: 0 }}
          viewport={{ once: true }}
          transition={{ duration: 0.8 }}
          className="max-w-4xl mx-auto"
        >
          <h2 className="text-4xl md:text-5xl font-bold mb-12 text-center">
            关于我
          </h2>

          {/* 介绍 */}
          <div className="mb-16">
            <p className="text-lg text-gray-300 leading-relaxed mb-6">
              我是一名充满热情的全栈开发工程师，专注于创建优雅、高效的 Web 应用程序。
              拥有多年的开发经验，熟悉现代前端和后端技术栈。
            </p>
            <p className="text-lg text-gray-300 leading-relaxed">
              我相信好的代码不仅要能运行，还要易于理解和维护。在工作中，我注重细节，
              追求用户体验的完美，并持续学习新技术来提升自己的技能。
            </p>
          </div>

          {/* 技能列表 */}
          <div>
            <h3 className="text-2xl font-bold mb-8">技能</h3>
            <div className="grid gap-8">
              {Object.entries(skillsByCategory).map(([category, categorySkills]) => (
                <div key={category}>
                  <h4 className="text-xl font-semibold mb-4 text-blue-400">{category}</h4>
                  <div className="grid grid-cols-2 md:grid-cols-3 gap-4">
                    {categorySkills.map((skill) => (
                      <div
                        key={skill.name}
                        className="bg-white/5 rounded-lg p-4 hover:bg-white/10 transition-colors"
                      >
                        <div className="flex justify-between items-center mb-2">
                          <span className="font-medium">{skill.name}</span>
                        </div>
                        <div className="flex gap-1">
                          {[...Array(5)].map((_, i) => (
                            <div
                              key={i}
                              className={`h-2 flex-1 rounded-full ${
                                i < skill.level
                                  ? 'bg-gradient-to-r from-blue-500 to-purple-500'
                                  : 'bg-white/10'
                              }`}
                            />
                          ))}
                        </div>
                      </div>
                    ))}
                  </div>
                </div>
              ))}
            </div>
          </div>
        </motion.div>
      </div>
    </section>
  );
};

export default About;

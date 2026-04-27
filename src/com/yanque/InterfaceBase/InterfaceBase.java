package com.yanque.InterfaceBase;

// 定义AI模型接口（标准）
interface AIModel {
    String predict(String input);  // 所有AI模型必须能预测
}

// 实现类1：模拟大语言模型
class LLMModel implements AIModel {
    @Override
    public String predict(String input) {
        return "LLM 推理: '" + input + "' 的语义是积极的";
    }
}

// 实现类2：模拟决策树模型
class DecisionTreeModel implements AIModel {
    @Override
    public String predict(String input) {
        // 简单模拟：如果输入包含数字则分类为数值型
        if (input.matches(".*\\d.*")) {
            return "决策树分类: 数值特征";
        } else {
            return "决策树分类: 文本特征";
        }
    }
}

public class InterfaceBase {
    public static void main(String[] args) {
        // 多态：用接口类型统一操作不同的AI模型
        AIModel model1 = new LLMModel();
        AIModel model2 = new DecisionTreeModel();

        System.out.println(model1.predict("今天天气真好"));
        System.out.println(model2.predict("温度25度"));
    }
}

package com.yanque.myreflect;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class Test03 {
    public static void main(String[] args) throws Exception {
        // 创建Student对象
        int[] scores = {90, 85, 92, 78, 88};
        Student stu = new Student("张三", 18, 1001, "pwd123456", scores);
        
        // 将对象属性写入文件
        writeObjectToFile(stu, "student_info.txt");
        
        System.out.println("对象属性已成功写入文件！");
    }
    
    /**
     * 使用反射获取对象的所有成员变量，并写入到文本文件
     * @param obj 要处理的对象
     * @param fileName 目标文件名
     */
    public static void writeObjectToFile(Object obj, String fileName) {
        if (obj == null) {
            System.out.println("对象为空，无法写入");
            return;
        }
        
        // 获取对象的Class对象
        Class<?> clazz = obj.getClass();
        
        // 获取所有声明的字段（包括私有字段）
        Field[] fields = clazz.getDeclaredFields();
        
        // 使用try-with-resources自动关闭资源
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // 写入类名
            writer.write("=== 对象信息 ===");
            writer.newLine();
            writer.write("类名: " + clazz.getSimpleName());
            writer.newLine();
            writer.write("-------------------");
            writer.newLine();
            
            // 遍历所有字段
            for (Field field : fields) {
                // 设置可访问（突破private限制）
                field.setAccessible(true);
                
                // 获取字段名
                String fieldName = field.getName();
                
                // 获取字段值
                Object fieldValue = field.get(obj);
                
                // 处理数组类型的字段
                String valueStr;
                if (fieldValue != null && fieldValue.getClass().isArray()) {
                    // 判断是int数组
                    if (fieldValue instanceof int[]) {
                        int[] intArray = (int[]) fieldValue;
                        valueStr = arrayToString(intArray);
                    } else {
                        valueStr = fieldValue.toString();
                    }
                } else {
                    valueStr = String.valueOf(fieldValue);
                }
                
                // 写入字段信息
                writer.write(fieldName + " = " + valueStr);
                writer.newLine();
            }
            
            writer.write("-------------------");
            writer.newLine();
            writer.write("写入时间: " + new java.util.Date());
            
        } catch (IOException e) {
            System.err.println("文件写入失败: " + e.getMessage());
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.err.println("无法访问字段: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * 将int数组转换为字符串格式
     * @param array int数组
     * @return 格式化后的字符串
     */
    private static String arrayToString(int[] array) {
        if (array == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

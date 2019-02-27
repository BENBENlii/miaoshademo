package com.miaoshademo.web.util;

import org.dozer.DozerBeanMapper;

import java.util.*;

/**
 * @author benben.li
 * @date 2019/2/26 15:50
 */
// 简单封装Dozer，实现深度转换Bean<->Bean的Mapper，实现：
// 1. 持有Mapper的单例
// 2. 返回值类型转换
// 3. 批量转换Collection中的所有对象
// 4. 区分创建新的B对象与将对象A值复制到已存在的B对象两种函数
public class BeanMapper {
    //单例，避免重复创建Dozer
    private static DozerBeanMapper dozer = new DozerBeanMapper();
    /**  
     * @Description 基于dozer转换对象类型
     * @Param [resource, destinationClass]
     * @return T
     */
    public static <T> T map(Object resource,Class<T> destinationClass){
        if (resource == null) {
            return null;
        }
        return dozer.map(resource,destinationClass);
    }
    /**  
     * @Description 基于dozer转换collection中对象的类型
     * @Param [resourceList, destinationClass]
     * @return java.util.List<T>
     */
    public static <T> List<T> mapList(Collection resourceList, Class<T> destinationClass){
        List<T> destinationList = new ArrayList<>();
        if (resourceList == null) {
            return destinationList;
        }
        for(Object resource : resourceList){
            T destinationObject  = dozer.map(resource,destinationClass);
            destinationList.add(destinationObject);
        }
        return destinationList;
    }
    /**
     * @Description 基于dozer将对象A的值拷贝到对象B中
     * @Param [resource, destinationObject]
     * @return T
     */
    public static <T> T copy(Object resource,T destinationObject){
        if (resource == null) {
            return null;
        }
        dozer.map(resource,destinationObject);
        return destinationObject;
    }
    /**
     * @Description List<T>转化成List<Map<String,Object>>
     * @Param [dataList]
     * @return java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     */
    public static <T> List<Map<String,Object>> toListMap(List dataList){
        List<Map<String,Object>> resultList = new ArrayList<>();
        if (dataList != null && dataList.size() !=0) {
            for (Object data : dataList){
                Map<String,Object> resultMap;
                if (!data.getClass().equals(HashMap.class)) {
                    resultMap = dozer.map(data,Map.class);
                }else {
                    resultMap = (Map<String, Object>) data;
                }
                resultList.add(resultMap);
            }
        }
        return resultList;
    }
}

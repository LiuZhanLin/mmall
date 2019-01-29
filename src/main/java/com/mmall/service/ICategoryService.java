package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.Category;

import java.util.List;

public interface ICategoryService {

    public ServerResponse addCategory(String categoryName, Integer parentId);

    public ServerResponse setCategoryName(Integer id,String categoryName);

    public ServerResponse<List<Category>> getChildrenParalleCategory(Integer id);

    public ServerResponse<List<Integer>> selectCategoryAndChildrenById(Integer categoryId);
}

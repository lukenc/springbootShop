package com.aotubuy.Service.impl;

import com.aotubuy.Dao.DollGoodsCategoryMapper;
import com.aotubuy.Model.DollGoodsCategory;
import com.aotubuy.Service.CategoryServive;
import com.aotubuy.Utils.CatTreeNode;
import com.aotubuy.Utils.CatTreeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by luke on 18-5-24.
 */
@Service
public class CategoryServiceImpl implements CategoryServive {
    @Autowired
    CatTreeUtils catTreeUtils;
    @Autowired
    DollGoodsCategoryMapper dollGoodsCategoryMapper;
        @Override
    public List<CatTreeNode> getCateTree() {
    List<DollGoodsCategory> dollGoodsCategoryList= dollGoodsCategoryMapper.selectAll();
    List<CatTreeNode> catTreeRoot=catTreeUtils.buildRootTree(dollGoodsCategoryList);
    return catTreeRoot;
    }
}

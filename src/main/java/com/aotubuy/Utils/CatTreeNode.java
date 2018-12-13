package com.aotubuy.Utils;

import com.aotubuy.Model.DollGoodsCategory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luke on 18-5-24.
 */
public class CatTreeNode {
    private CatTreeNode parentCat;
    private DollGoodsCategory category;
    private List<CatTreeNode> childCategoryList;

    CatTreeNode(CatTreeNode parentCat, DollGoodsCategory category) {
        this.parentCat = parentCat;
        this.category = category;
        this.childCategoryList=new ArrayList<>();
    }

    public void addChild(CatTreeNode category) {
        childCategoryList.add(category);
    }

    public void addChilds(List<CatTreeNode> categories) {
        childCategoryList.addAll(categories);
    }


    /**
     * 获取分类层级
     */
    public Integer getlevel() {
        return category.getLevel().intValue();
    }

    public Integer getId(){return category.getId().intValue();}

    public CatTreeNode getParentCat() {
        return parentCat;
    }

    public void setParentCat(CatTreeNode parentCat) {
        this.parentCat = parentCat;
    }

    public DollGoodsCategory getCategory() {
        return category;
    }

    public void setCategory(DollGoodsCategory category) {
        this.category = category;
    }

    public List<CatTreeNode> getChildCategoryList() {
        return childCategoryList;
    }

    public void setChildCategoryList(List<CatTreeNode> childCategoryList) {
        this.childCategoryList = childCategoryList;
    }
}

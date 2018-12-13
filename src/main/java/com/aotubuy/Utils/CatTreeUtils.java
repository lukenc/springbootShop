package com.aotubuy.Utils;

import com.aotubuy.Model.DollGoodsCategory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by luke on 18-5-24.
 */
@Service
public class CatTreeUtils {
    public List<CatTreeNode> buildRootTree(List<DollGoodsCategory> dollGoodsCategoryList){
        Map<Integer, List<DollGoodsCategory>> levels = getLevelOneNodes(dollGoodsCategoryList);
        List<DollGoodsCategory> level1s = levels.get(1);
        List<DollGoodsCategory> level2s = levels.get(2);
        List<DollGoodsCategory> level3s = levels.get(3);
        List<CatTreeNode> level1Nodes=new ArrayList<>();
        List<CatTreeNode> level2Nodes=new ArrayList<>();
        List<CatTreeNode> level3Nodes=new ArrayList<>();
        for (DollGoodsCategory level1:level1s
             ) {
            level1Nodes.add(new CatTreeNode(null,level1));
        }

        for (DollGoodsCategory level2:level2s
                ) {
            level2Nodes.add(new CatTreeNode(null,level2));
        }

        for (DollGoodsCategory level3:level3s
                ) {
            level3Nodes.add(new CatTreeNode(null,level3));
        }


        for (CatTreeNode level2CatNode:level2Nodes
             ) {
            for (CatTreeNode level3CatNode:level3Nodes
                 ) {
                if (level2CatNode.getCategory().getId()==level3CatNode.getCategory().getParentId()){
                    level2CatNode.addChild(level3CatNode);
                    level3CatNode.setParentCat(level2CatNode);
                }
            }
        }

        for (CatTreeNode level1CatNode:level1Nodes
                ) {
            for (CatTreeNode level2CatNode:level2Nodes
                    ) {
                if (level1CatNode.getCategory().getId()==level2CatNode.getCategory().getParentId()){
                    level1CatNode.addChild(level2CatNode);
                    level2CatNode.setParentCat(level1CatNode);
                }
            }
        }
        return level1Nodes;
    }





    public Map<Integer, List<DollGoodsCategory>> getLevelOneNodes(List<DollGoodsCategory> dollGoodsCategories){
        Map<Integer,List<DollGoodsCategory>> eachLevels=new HashMap<>();
      List<DollGoodsCategory> levelOnes=new ArrayList<>();
        List<DollGoodsCategory> level2s=new ArrayList<>();
        List<DollGoodsCategory> level3s=new ArrayList<>();
        for (DollGoodsCategory cat:
             dollGoodsCategories) {
            if(cat.getLevel()==1){
                levelOnes.add(cat);
            }
            if(cat.getLevel()==2){
                level2s.add(cat);
            }
            if(cat.getLevel()==3){
                level3s.add(cat);
            }
        }
        eachLevels.put(1,levelOnes);
        eachLevels.put(2,level2s);
        eachLevels.put(3,level3s);
        return eachLevels;
    }


}

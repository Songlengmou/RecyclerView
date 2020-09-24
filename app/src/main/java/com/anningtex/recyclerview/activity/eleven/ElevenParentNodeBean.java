package com.anningtex.recyclerview.activity.eleven;

import com.chad.library.adapter.base.entity.node.BaseExpandNode;
import com.chad.library.adapter.base.entity.node.BaseNode;

import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @Author: Song
 */
public class ElevenParentNodeBean extends BaseExpandNode {
    private List<BaseNode> childNode;
    private String title;

    public ElevenParentNodeBean() {
        setExpanded(false);
    }

    public void setChildNode(List<BaseNode> childNode) {
        this.childNode = childNode;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Nullable
    @Override
    public List<BaseNode> getChildNode() {
        return childNode;
    }
}

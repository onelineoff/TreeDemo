package com.github.onelineoff.treedemo.controller;

import java.util.Collection;

import com.github.onelineoff.treedemo.dto.Node;

public interface NodeController {
	public Collection<Node> getSubtree(int id);
	public Collection<Node> getParents(int id);
	public Node createRootNode(String name);
	public Node createNode(String name, int parentId);
	public boolean moveNode(Node node, int parentId);
	public boolean deleteNode(Node node, boolean recursiveFlag);
	public int getHeight(Node node);
}

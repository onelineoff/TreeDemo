package com.github.onelineoff.treedemo.controller;

import java.util.Collection;

import com.github.onelineoff.treedemo.dto.Node;

/** A simple implementation of the node controller interface.
 *  No effort is made here to ensure that the operations are multi-thread safe.
 * 
 */
public class SimpleNodeController implements NodeController {

	@Override
	public Collection<Node> getSubtree(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Node> getParents(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node createRootNode(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node createNode(String name, int parentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean moveNode(Node node, int parentId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteNode(Node node, boolean recursiveFlag) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getHeight(Node node) {
		// TODO Auto-generated method stub
		return 0;
	}

}

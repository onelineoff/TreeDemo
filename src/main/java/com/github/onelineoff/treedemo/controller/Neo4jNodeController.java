package com.github.onelineoff.treedemo.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Controller;

import com.github.onelineoff.treedemo.dto.Node;

/** A simple implementation of the node controller interface.
 *  No effort is made here to ensure that the operations are multi-thread safe.
 * 
 */
@Controller
public class Neo4jNodeController implements NodeController {

	@Override
	public Collection<Node> getSubtree(int id) {
		Collection<Node> list = new ArrayList<>();
		// TODO: Make real call, instead of stub data.
		Node root = new Node();
		root.setName("Root");
		root.setId(0);
		Node n1 = new Node();
		n1.setName("Node 1");
		n1.setId(1);
		n1.setParentNode(root);
		n1.setRootNode(root);
		list.add(n1);
		Node n2 = new Node();
		n2.setName("Node 2");
		n2.setId(2);
		n2.setParentNode(n1);
		n2.setRootNode(root);
		list.add(n2);
		Node n3 = new Node();
		n3.setName("Node 3");
		n3.setId(3);
		n3.setParentNode(n1);
		n3.setRootNode(root);
		list.add(n3);
		
		return list;
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

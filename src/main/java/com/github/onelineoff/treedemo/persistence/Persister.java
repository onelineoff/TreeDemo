package com.github.onelineoff.treedemo.persistence;

import java.util.Collection;

import com.github.onelineoff.treedemo.dto.Node;

public interface Persister {
	public void saveOrUpdate(Node node);
	public void saveOrUpdates(Collection<Node> nodes);
	public void delete(Node node);
	public void delete(Collection<Node> nodes);	
}

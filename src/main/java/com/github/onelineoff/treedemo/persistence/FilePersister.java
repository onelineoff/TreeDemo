package com.github.onelineoff.treedemo.persistence;

import java.util.Collection;

import com.github.onelineoff.treedemo.dto.Node;

/** Simple implementation of a file system persister.
 *  Each node will be saved to a file with the filename corresponding to the node,
 *  e.g., node2739.properties.
 *  
 *  This would be far too slow and error prone for a production system.
 *
 */
public class FilePersister implements Persister {

	@Override
	public void saveOrUpdate(Node node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveOrUpdates(Collection<Node> nodes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Node node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Collection<Node> nodes) {
		// TODO Auto-generated method stub
		
	}

}

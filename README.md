Tree Demo
=========

# Purpose

This is demo code for building and reporting on a tree structure.  It's implemented using Java and Spring, and will expose a REST interface.  It can run as a standalone application, or inside Docker or some other container infrastructure.



# Limitations

This is intended as a demo project, not for any practical use.  It's meant to be production quality code as far as it goes, but there are assorted limitations, including:

1. Persistence is done to the file system, which is not performant.
2. Each docker container, or standalone Java application does not interact with other instances, and it is not safe for them to share the same persistence files.
3. All node information will be held in memory, so that is a limitation as to the size of the tree.
4. Since the nodes are mutable, operations cannot necessarily be run in parallel without inconsistent information being returned.  This project does **NOT** attempt to make the REST calls safe in a multi-user environment.

# REST API

The GET calls allow for retrieving information about the tree.  The POST calls allow for creating nodes.  The PUT call allows for updating of the node, and the DELETE call allows for deletion.

## GET

1. getSubtree?node=<id>
2. getParents?node=<id>

The first call returns information about the specified node, as well as information for subnodes to any level.

The second call gets the parents of the specified node, up to the root.

The Content-Type header can be set to application/xml, or application/json to get the data in the appropriate format.

## POST

Each node contains a small amount of data, so the decision was made to pass the name and parent id as parameters as opposed to attaching a request body.  Either way would work equally well.  The request body would allow for a createNodes call where multiple nodes are specified at one time.

1. createRootNode?name=<name>
2. createNode?name=<name>&parentId=<id>

The createRootNode call returns a 204 the first time, and a 403 after a root node has already been created.

The createNode call returns a 200, along with the response body.  This is necessary because the server determines the node id.  The body will be either xml or json, in the same format as the GET calls, with the Accept header set to either application/xml or application/json.  If the parentId is invalid, then a 403 is returned.

By definition, the root node always has an id of 0.



## PUT

The moveNode call can be called on any node which is **NOT** the root node.  The root node can never be moved.

1. moveNode?id=<id>&parentId=<id>

The moveNode returns a 204 on success, or a 403 if the parentId is invalid.

## DELETE

1. deleteNode?id=<id>&recursive=<true|false>

The deleteNode call returns 204 on success, or 403 if the id doesn't exist, or the recursive flag is set to false, and the node has children.  The default for the recursive flag is true.

# Deploy

It should be possible just to run the code from the jar file on the command line, but a Dockerfile will be created so that the code can be run as a docker container.

# TODO

Numerous things can be done to make the code better.

1. Implement some sort of transactional logic so that conflicting calls are somehow resolved.  
2. Implement a more robust persistence solution than the file system, such as an RDBMS.
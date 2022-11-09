# Adjacency Matrix Graph

### Introduction
This implementation of a Graph is represented by an adjacency matrix. It is not formed by linkage between the Node and Edge classes. 

### Matrix Representation
Indexes of the rows and columns of the matrix represent the Id's of a node. A given coordinate, an intersction of a row r and a column c, represents whether an edge extends from the Node (Id=r) to the Node (Id=c).

### Benefits
The benefit of this representation as opposed to Node & Edge linkage is that it takes a constant time to determine if an edge exists between two nodes.

### Author
Zach Berman
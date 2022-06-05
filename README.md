# algorithm-java
The algorithm I've designed has a complexity of N+M, being N the number of operations and 
M the length of the array. This approach performs better than the simpler approach that I 
discuss below, but in tradeoff we get a less intuitive approach. In this case, we directly 
determine the ranges in which we should sum the number by adding this number to the start 
index and subtracting it after the end index. This way we can iterate from left to right
and we will always know how much is the current position's value. An interesting thing about
this algorithm is that every number fits into an int except for the maxNumber, since by adding
the maximum number that is possible to add numerous times (I believe it was more than twice)
we go over the int limit. For that reason, I've used a long.

Other possible solutions could be a simple nested loop with NxM complexity. This approach is quite simple to understand since you just add the amoount directly to the needed positions in the array.

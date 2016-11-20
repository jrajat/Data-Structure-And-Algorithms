In a party of N people, only one person is known to everyone. Such a person may be present in the party, if yes, (s)he doesn’t know anyone in the party. We can only ask questions like “does A know B? “. Find the stranger (celebrity) in minimum number of questions.
We can describe the problem input as an array of numbers/characters representing persons in the party. We also have a hypothetical function HaveAcquaintance(A, B) which returns true if A knows B, false otherwise. How can we solve the problem.



**Methods**:
- Graph Draw vertices from A->B if A knows B, and then traverse all vertices one which has no outdegree and N-1 indegree is celebrity
-  Recursion, compare celebrity (N-1) with N and decide
- Stack Put all elements in stack as candidate of being celebrity. POP last 2 elements and compare which can be the celebrity [If A knows B, B can be candidate but A can’t else if  A doesn’t know B, B can’t be candidate but A can be] Repeat till only single element is left in stack, and then re-check if candidate element is answer 

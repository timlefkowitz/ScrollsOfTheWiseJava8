package CaseStudy;

public class OblongCold {


//    infanit_chess

    /*

    1. Understand
    2. Diagram
    4. Pseudocode
    4. Code






    my example"



    x ->
    [
            [,0,0,0,0,0,0,0]
            [,0,0,0,0,0,0,0]
            [,0,0,0,0,0,0,0]
            [,0,0,0,0,0,0,0]
            [,0,0,0,0,0,0,0]
    ]
    y
        |
        v

        breadth-first search

        queue (first in, first out)
        [x,y, distance]
        ----------------------------------------
        [-1,2][2,-1][1,2][-2,1]
        ----------------------------------------

        current = [-1, -2, 1]
                up -1, left 2
        up 2, left -1
        up 1, left 2
                up -2, left 1

            visited ={
               "0_0"
}


-initialize a queue

-enwueue [0,0,0] in queue
- initialize visited set
- store "0_0" in visited

- while queue has elements
-set current to first element in queue
- if the current coordinates match the input coordinates
- return distance for current element
- find eight possiable next postions (children)
- if children positions haven't been traveled
store child in queue


     */

//    class minStepsToCell(x,y)
//        const queue = [];
//        queue.push([0,0,0]);
//
//
//        class visited= new Set();
//        visited.add("0_0")
//
//        let x,y distance;
//
//        const moveset =      [-1,2][2,-1][1,2][-2,1]
//
//        while(queque.length > 0 )
//    {
//        [x,y,distance] = queue.shift();
//        if[x === xDest && y === ydest]
//    }

}

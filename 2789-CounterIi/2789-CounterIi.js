// Last updated: 6/22/2025, 11:02:43 AM
/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
let pre=init;
function increment(){
    return ++pre;
}
function reset(){
    return (pre=init);
}
function decrement(){
    return --pre;
}
return {increment,reset,decrement};  
};



/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */
/**
 * @param {Function} fn
 * @return {Function}
 */
var once = function(fn) {
    var calledOnce=false;
    return function(...args){
        if(!calledOnce){
            calledOnce=true;
            return fn(...args);
        }
        else{
            return undefined;
        }
        
    }
};

/**
 * let fn = (a,b,c) => (a + b + c)
 * let onceFn = once(fn)
 *
 * onceFn(1,2,3); // 6
 * onceFn(2,3,6); // returns undefined without calling fn
 */

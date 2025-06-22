// Last updated: 6/22/2025, 11:02:42 AM
/**
 * @return {Function}
 */
var createHelloWorld = function() {
    const hey="Hello World";
    
    return function(...args) {
        return hey;
        
    }
};

/**
 * const f = createHelloWorld();
 * f(); // "Hello World"
 */
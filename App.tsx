import React from 'react';
import {NativeModules, Button, View, Text} from 'react-native';
const {Counter} = NativeModules;

const App = () => {
  const [count, setCount] = React.useState(0);

  const handleIncrease = () => {
    Counter.increase();
    updateCount();
  };

  const handleDecrease = () => {
    Counter.decrease();
    updateCount();
  };

  const updateCount = () => {
    Counter.getCount(setCount);
  };

  return (
    <View style={{flex: 1, justifyContent: 'center', alignItems: 'center'}}>
      <Text>Count: {count}</Text>
      <Button title="Increase" onPress={handleIncrease} />
      <Button title="Decrease" onPress={handleDecrease} />
    </View>
  );
};

export default App;

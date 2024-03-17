import 'package:flutter/material.dart';

import 'src/pages/barter_login.dart';

void main() async {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Barter',
      theme: ThemeData(),
      initialRoute: '/',
      routes: {'/': (context) => BarterLogin()},
    );
  }
}

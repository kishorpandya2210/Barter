import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;
import 'dart:convert';

class BarterLogin extends StatefulWidget {
  @override
  _BarterLoginState createState() => _BarterLoginState();
}

class _BarterLoginState extends State<BarterLogin> {
  final TextEditingController _usernameController = TextEditingController();
  final TextEditingController _passwordController = TextEditingController();

  Future<void> _login() async {
    final String loginUrl = 'http://192.168.56.1:8080/login';
    final response = await http.post(
      Uri.parse(loginUrl),
      headers: <String, String>{
        'Content-Type': 'application/json; charset=UTF-8',
      },
      body: jsonEncode(<String, String>{
        'email': _usernameController.text,
        'password': _passwordController.text,
      }),
    );

    if (response.statusCode == 200) {
      // If the server returns a 200 OK response, then parse the JSON.
      print('Login successful');
      // Here, you can navigate to another screen or perform other actions.
    } else {
      // If the server did not return a 200 OK response,
      // then throw an exception.
      print('Failed to log in: ${response.body}');
      // Here, you can show an error message or perform other error handling.
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Login'),
      ),
      body: Padding(
        padding: const EdgeInsets.all(18),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            TextField(
              controller: _usernameController,
              decoration: InputDecoration(labelText: 'Username'),
            ),
            SizedBox(
              height: 8,
            ),
            TextField(
              controller: _passwordController,
              decoration: InputDecoration(labelText: 'Password'),
              obscureText: true,
            ),
            SizedBox(height: 16),
            ElevatedButton(
              onPressed: _login,
              child: Text('Login'),
            ),
          ],
        ),
      ),
    );
  }
}

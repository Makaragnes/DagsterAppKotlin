import 'package:dagster/models/user.dart';
import 'package:dagster/screens/authenticate/authenticate.dart';
import 'package:dagster/screens/home/home.dart';
import 'package:dagster/services/auth.dart';
import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:dagster/models/user.dart';

class Wrapper extends StatelessWidget {
  @override
  Widget build(BuildContext context){

    final user = Provider.of<User>(context);
    print(user);

    // In here we return a auth screen or home screen
    if(user == null){
      return Authenticate();
    } return Home();

  }
}
import 'package:dagster/models/user.dart';
import 'package:firebase_auth/firebase_auth.dart';

class AuthService {
  final FirebaseAuth _auth = FirebaseAuth.instance;

  // create user object based on firebase user
  User _userFromFirebaseUser(FirebaseUser user) {
    // if (user != null) {
    //   return User(uid: user.uid);
    // }

    return User(uid: user.uid);
    // one bag is here
    // if(user == null){
    //   return null;
    // }
    //return user != null ? User(uid: user.uid) : null;
  }

  // auth change user stream

  Stream<User>? get user {
    return _auth.onAuthStateChanged
        //.map((FirebaseUser user) => _userFromFirebaseUser(user));
        .map(_userFromFirebaseUser);
  }

  //sign in anon
  Future singInAnon() async {
    try {
      AuthResult result = await _auth.signInAnonymously();
      FirebaseUser user = result.user;
      return _userFromFirebaseUser(user);
    } catch (e) {
      print(e.toString());
      return null;
    }
  }

// sign in with email & password

// register with email & password

// sign out

Future signOut() async{
    try{
      return await _auth.signOut();

    } catch(e) {
      print(e.toString());
      return null;

    }
}

// sign in by phone

// register by phone
}

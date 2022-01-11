package finalClass;

class SocialMedia {
    String name;
}

/**
 * Final Class : cannot create child/inherit from this class
 */
final class Facebook extends SocialMedia {

}

// ERROR : cannot create child from final class
//class FakeFacebook extends Facebook {
//
//}

class Instagram extends SocialMedia {
    /**
     * Final Method : cannot create overridden method in child
     */
    final void login(String username, String password) {

    }
}

class FakeInstagram extends Instagram {
    // ERROR : final method cannot be overridden
//    void login(String username, String password) {
//
//    }
}
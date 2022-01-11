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

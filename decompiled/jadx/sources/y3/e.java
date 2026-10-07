package y3;

import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements q4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageDigest f10552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q4.e f10553b = new q4.e();

    public e(MessageDigest messageDigest) {
        this.f10552a = messageDigest;
    }

    @Override // q4.b
    public final q4.e c() {
        return this.f10553b;
    }
}

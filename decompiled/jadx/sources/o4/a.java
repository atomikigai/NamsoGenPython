package o4;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import p4.n;
import u3.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f7554c;

    public a(int i, f fVar) {
        this.f7553b = i;
        this.f7554c = fVar;
    }

    @Override // u3.f
    public final void a(MessageDigest messageDigest) {
        this.f7554c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f7553b).array());
    }

    @Override // u3.f
    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f7553b == aVar.f7553b && this.f7554c.equals(aVar.f7554c)) {
                return true;
            }
        }
        return false;
    }

    @Override // u3.f
    public final int hashCode() {
        return n.h(this.f7553b, this.f7554c);
    }
}

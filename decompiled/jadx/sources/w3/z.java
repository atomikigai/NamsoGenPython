package w3;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements u3.f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p4.j f9594j = new p4.j(50);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x3.f f9595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u3.f f9596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u3.f f9597d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9598f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f9599g;
    public final u3.i h;
    public final u3.m i;

    public z(x3.f fVar, u3.f fVar2, u3.f fVar3, int i, int i10, u3.m mVar, Class cls, u3.i iVar) {
        this.f9595b = fVar;
        this.f9596c = fVar2;
        this.f9597d = fVar3;
        this.e = i;
        this.f9598f = i10;
        this.i = mVar;
        this.f9599g = cls;
        this.h = iVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // u3.f
    public final void a(MessageDigest messageDigest) {
        Object objE;
        x3.f fVar = this.f9595b;
        synchronized (fVar) {
            x3.e eVar = fVar.f10272b;
            x3.h hVarD = (x3.h) ((ArrayDeque) eVar.f159a).poll();
            if (hVarD == null) {
                hVarD = eVar.d();
            }
            x3.d dVar = (x3.d) hVarD;
            dVar.f10268b = 8;
            dVar.f10269c = byte[].class;
            objE = fVar.e(dVar, byte[].class);
        }
        byte[] bArr = (byte[]) objE;
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f9598f).array();
        this.f9597d.a(messageDigest);
        this.f9596c.a(messageDigest);
        messageDigest.update(bArr);
        u3.m mVar = this.i;
        if (mVar != null) {
            mVar.a(messageDigest);
        }
        this.h.a(messageDigest);
        p4.j jVar = f9594j;
        Class cls = this.f9599g;
        byte[] bytes = (byte[]) jVar.a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(u3.f.f8847a);
            jVar.d(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f9595b.g(bArr);
    }

    @Override // u3.f
    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f9598f == zVar.f9598f && this.e == zVar.e && p4.n.b(this.i, zVar.i) && this.f9599g.equals(zVar.f9599g) && this.f9596c.equals(zVar.f9596c) && this.f9597d.equals(zVar.f9597d) && this.h.equals(zVar.h)) {
                return true;
            }
        }
        return false;
    }

    @Override // u3.f
    public final int hashCode() {
        int iHashCode = ((((this.f9597d.hashCode() + (this.f9596c.hashCode() * 31)) * 31) + this.e) * 31) + this.f9598f;
        u3.m mVar = this.i;
        if (mVar != null) {
            iHashCode = (iHashCode * 31) + mVar.hashCode();
        }
        return this.h.f8852b.hashCode() + ((this.f9599g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f9596c + ", signature=" + this.f9597d + ", width=" + this.e + ", height=" + this.f9598f + ", decodedResourceClass=" + this.f9599g + ", transformation='" + this.i + "', options=" + this.h + '}';
    }
}

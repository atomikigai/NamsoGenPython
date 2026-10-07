package od;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f7750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f7751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7752c;

    public o(t tVar) {
        jc.i.e(tVar, "sink");
        this.f7750a = tVar;
        this.f7751b = new f();
    }

    @Override // od.g
    public final g D(long j4) {
        if (this.f7752c) {
            throw new IllegalStateException("closed");
        }
        this.f7751b.W(j4);
        c();
        return this;
    }

    @Override // od.t
    public final x a() {
        return this.f7750a.a();
    }

    public final g c() {
        if (this.f7752c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f7751b;
        long j4 = fVar.f7734b;
        if (j4 == 0) {
            j4 = 0;
        } else {
            q qVar = fVar.f7733a;
            jc.i.b(qVar);
            q qVar2 = qVar.f7761g;
            jc.i.b(qVar2);
            int i = qVar2.f7758c;
            if (i < 8192 && qVar2.e) {
                j4 -= (long) (i - qVar2.f7757b);
            }
        }
        if (j4 > 0) {
            this.f7750a.f(j4, fVar);
        }
        return this;
    }

    @Override // od.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        t tVar = this.f7750a;
        if (this.f7752c) {
            return;
        }
        f fVar = this.f7751b;
        long j4 = fVar.f7734b;
        if (j4 > 0) {
            tVar.f(j4, fVar);
        }
        th = null;
        try {
            tVar.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f7752c = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // od.t
    public final void f(long j4, f fVar) {
        jc.i.e(fVar, "source");
        if (this.f7752c) {
            throw new IllegalStateException("closed");
        }
        this.f7751b.f(j4, fVar);
        c();
    }

    @Override // od.g, od.t, java.io.Flushable
    public final void flush() {
        if (this.f7752c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f7751b;
        long j4 = fVar.f7734b;
        t tVar = this.f7750a;
        if (j4 > 0) {
            tVar.f(j4, fVar);
        }
        tVar.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f7752c;
    }

    public final String toString() {
        return "buffer(" + this.f7750a + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        jc.i.e(byteBuffer, "source");
        if (this.f7752c) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f7751b.write(byteBuffer);
        c();
        return iWrite;
    }

    @Override // od.g
    public final g writeByte(int i) {
        if (this.f7752c) {
            throw new IllegalStateException("closed");
        }
        this.f7751b.V(i);
        c();
        return this;
    }

    @Override // od.g
    public final g writeInt(int i) {
        if (this.f7752c) {
            throw new IllegalStateException("closed");
        }
        this.f7751b.X(i);
        c();
        return this;
    }

    @Override // od.g
    public final g writeShort(int i) {
        if (this.f7752c) {
            throw new IllegalStateException("closed");
        }
        this.f7751b.Y(i);
        c();
        return this;
    }

    @Override // od.g
    public final g x(i iVar) {
        jc.i.e(iVar, "byteString");
        if (this.f7752c) {
            throw new IllegalStateException("closed");
        }
        this.f7751b.T(iVar);
        c();
        return this;
    }

    @Override // od.g
    public final g y(String str) {
        jc.i.e(str, "string");
        if (this.f7752c) {
            throw new IllegalStateException("closed");
        }
        this.f7751b.a0(str);
        c();
        return this;
    }

    @Override // od.g
    public final g write(byte[] bArr) {
        if (!this.f7752c) {
            this.f7751b.S(bArr.length, bArr);
            c();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}

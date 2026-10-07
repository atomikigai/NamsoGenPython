package v1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9140d;

    public k(int i, int i10, long j4, long j10) {
        this.f9137a = i;
        this.f9138b = i10;
        this.f9139c = j4;
        this.f9140d = j10;
    }

    public static k a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            k kVar = new k(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return kVar;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f9137a);
            dataOutputStream.writeInt(this.f9138b);
            dataOutputStream.writeLong(this.f9139c);
            dataOutputStream.writeLong(this.f9140d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof k)) {
            k kVar = (k) obj;
            if (this.f9138b == kVar.f9138b && this.f9139c == kVar.f9139c && this.f9137a == kVar.f9137a && this.f9140d == kVar.f9140d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f9138b), Long.valueOf(this.f9139c), Integer.valueOf(this.f9137a), Long.valueOf(this.f9140d));
    }
}

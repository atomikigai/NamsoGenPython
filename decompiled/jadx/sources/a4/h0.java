package a4;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements y, u3.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f147b = new h0(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148a;

    public /* synthetic */ h0(int i) {
        this.f148a = i;
    }

    public static ByteArrayInputStream a(String str) {
        if (!str.startsWith("data:image")) {
            throw new IllegalArgumentException("Not a valid image data URL.");
        }
        int iIndexOf = str.indexOf(44);
        if (iIndexOf == -1) {
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        if (str.substring(0, iIndexOf).endsWith(";base64")) {
            return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
        }
        throw new IllegalArgumentException("Not a base64 image data URL.");
    }

    public Class b() {
        switch (this.f148a) {
            case 1:
                return ByteBuffer.class;
            case 3:
                return InputStream.class;
            case 8:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // a4.y
    public x i(e0 e0Var) {
        switch (this.f148a) {
            case 0:
                return i0.f151b;
            case 2:
                return new d(new h0(1), 0);
            case 4:
                return new d(new h0(3), 0);
            case 6:
                return new i0(1);
            case 11:
                return new g0(e0Var.a(Uri.class, AssetFileDescriptor.class), 0);
            case 12:
                return new g0(e0Var.a(Uri.class, ParcelFileDescriptor.class), 0);
            case 13:
                return new g0(e0Var.a(Uri.class, InputStream.class), 0);
            default:
                return new l0(e0Var.a(n.class, InputStream.class));
        }
    }

    @Override // u3.c
    public boolean p(Object obj, File file, u3.i iVar) throws Throwable {
        try {
            p4.b.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("ByteBufferEncoder", 3)) {
                return false;
            }
            Log.d("ByteBufferEncoder", "Failed to write data", e);
            return false;
        }
    }
}

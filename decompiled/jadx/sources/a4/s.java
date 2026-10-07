package a4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements com.bumptech.glide.load.data.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f172d = {"_data"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f175c;

    public /* synthetic */ s(int i, Object obj, Object obj2) {
        this.f173a = i;
        this.f174b = obj;
        this.f175c = obj2;
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        switch (this.f173a) {
            case 0:
                return File.class;
            default:
                return ((h0) this.f175c).b();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
        int i = this.f173a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        int i = this.f173a;
    }

    @Override // com.bumptech.glide.load.data.e
    public final int d() {
        switch (this.f173a) {
        }
        return 1;
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.f fVar, com.bumptech.glide.load.data.d dVar) {
        Object objWrap;
        switch (this.f173a) {
            case 0:
                Cursor cursorQuery = ((Context) this.f174b).getContentResolver().query((Uri) this.f175c, f172d, null, null, null);
                String string = null;
                if (cursorQuery != null) {
                    try {
                        string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                        cursorQuery.close();
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                    break;
                }
                if (!TextUtils.isEmpty(string)) {
                    dVar.f(new File(string));
                    return;
                }
                dVar.b(new FileNotFoundException("Failed to find file path for: " + ((Uri) this.f175c)));
                return;
            default:
                h0 h0Var = (h0) this.f175c;
                byte[] bArr = (byte[]) this.f174b;
                switch (h0Var.f148a) {
                    case 1:
                        objWrap = ByteBuffer.wrap(bArr);
                        break;
                    default:
                        objWrap = new ByteArrayInputStream(bArr);
                        break;
                }
                dVar.f(objWrap);
                return;
        }
    }

    private final void b() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }
}

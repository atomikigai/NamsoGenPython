package d4;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements u3.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final u3.h f2860b = u3.h.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u3.h f2861c = new u3.h("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, u3.h.e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x3.f f2862a;

    public b(x3.f fVar) {
        this.f2862a = fVar;
    }

    @Override // u3.l
    public final int f(u3.i iVar) {
        return 2;
    }

    @Override // u3.c
    public final boolean p(Object obj, File file, u3.i iVar) throws Throwable {
        boolean z4;
        Bitmap bitmap = (Bitmap) ((w3.x) obj).get();
        u3.h hVar = f2861c;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) iVar.c(hVar);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = p4.h.f7800b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) iVar.c(f2860b)).intValue();
        OutputStream cVar = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    x3.f fVar = this.f2862a;
                    if (fVar != null) {
                        try {
                            cVar = new com.bumptech.glide.load.data.c(fileOutputStream, fVar);
                        } catch (IOException e) {
                            e = e;
                            cVar = fileOutputStream;
                            if (Log.isLoggable("BitmapEncoder", 3)) {
                                Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                            }
                            if (cVar != null) {
                                try {
                                    cVar.close();
                                } catch (IOException unused) {
                                }
                            }
                            z4 = false;
                        } catch (Throwable th) {
                            th = th;
                            cVar = fileOutputStream;
                            if (cVar != null) {
                                try {
                                    cVar.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        cVar = fileOutputStream;
                    }
                    bitmap.compress(compressFormat, iIntValue, cVar);
                    cVar.close();
                    try {
                        cVar.close();
                    } catch (IOException unused3) {
                    }
                    z4 = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            } catch (IOException e4) {
                e = e4;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + p4.n.c(bitmap) + " in " + p4.h.a(jElapsedRealtimeNanos) + ", options format: " + iVar.c(hVar) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            return z4;
        } catch (Throwable th3) {
            th = th3;
        }
    }
}

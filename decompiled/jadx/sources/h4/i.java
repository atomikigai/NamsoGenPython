package h4;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import u3.k;
import w3.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f4965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f4966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x3.f f4967c;

    public i(ArrayList arrayList, a aVar, x3.f fVar) {
        this.f4965a = arrayList;
        this.f4966b = aVar;
        this.f4967c = fVar;
    }

    @Override // u3.k
    public final x a(Object obj, int i, int i10, u3.i iVar) {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i11 = inputStream.read(bArr);
                if (i11 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i11);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f4966b.a(ByteBuffer.wrap(byteArray), i, i10, iVar);
    }

    @Override // u3.k
    public final boolean b(Object obj, u3.i iVar) {
        return !((Boolean) iVar.c(h.f4964b)).booleanValue() && n9.b.p(this.f4965a, (InputStream) obj, this.f4967c) == ImageHeaderParser$ImageType.GIF;
    }
}

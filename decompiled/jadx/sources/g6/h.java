package g6;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import h6.p;
import h6.r0;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4194a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4195b;

    public h(Context context) {
        this.f4195b = context;
    }

    @Override // h6.p
    public final void zza() {
        boolean zB;
        BitmapDrawable bitmapDrawable;
        switch (this.f4194a) {
            case 0:
                i iVar = (i) this.f4195b;
                Bitmap bitmap = (Bitmap) ((ConcurrentHashMap) d6.p.C.f2996w.f5256b).get(Integer.valueOf(iVar.f4197b.f1976z.f2958f));
                if (bitmap != null) {
                    d6.i iVar2 = iVar.f4197b.f1976z;
                    boolean z4 = iVar2.f2957d;
                    float f10 = iVar2.e;
                    Activity activity = iVar.f4196a;
                    if (z4 && f10 > 0.0f && f10 <= 25.0f) {
                        try {
                            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
                            RenderScript renderScriptCreate = RenderScript.create(activity);
                            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
                            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
                            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
                            scriptIntrinsicBlurCreate.setRadius(f10);
                            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
                            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
                            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
                            bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmapCreateBitmap);
                        } catch (RuntimeException unused) {
                            bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                        }
                        break;
                    } else {
                        bitmapDrawable = new BitmapDrawable(activity.getResources(), bitmap);
                    }
                    r0.f5068l.post(new a3.e(this, bitmapDrawable, 12, false));
                    return;
                }
                return;
            default:
                try {
                    zB = b6.b.b((Context) this.f4195b);
                    break;
                } catch (g7.g | IOException | IllegalStateException e) {
                    i6.h.e("Fail to get isAdIdFakeForDebugLogging", e);
                    zB = false;
                }
                synchronized (i6.g.f5227b) {
                    i6.g.f5228c = true;
                    i6.g.f5229d = zB;
                    break;
                }
                i6.h.g("Update ad debug logging enablement as " + zB);
                return;
        }
    }

    public /* synthetic */ h(i iVar) {
        this.f4195b = iVar;
    }
}

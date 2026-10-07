package wa;

import a4.e0;
import a4.g0;
import a4.x;
import a4.y;
import android.graphics.Path;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.text.Editable;
import android.text.Selection;
import android.view.View;
import androidx.emoji2.text.w;
import com.bumptech.glide.manager.n;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.components.ComponentRegistrar;
import d4.b0;
import d4.c0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executors;
import o6.h0;
import org.json.JSONObject;
import t2.m;
import yb.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements h, y, n, s, c0, Continuation, c6.b, i6.c, ka.c, n5.b, l6.d, la.a, q4.c, r6.b {
    public /* synthetic */ d(Object obj) {
    }

    public static ka.b b(b9.e eVar) {
        return new ka.b(System.currentTimeMillis() + ((long) 3600000), new m(8), new ka.a(true, false, false), 10.0d, 1.2d, 60);
    }

    public static Path c(float f10, float f11, float f12, float f13) {
        Path path = new Path();
        path.moveTo(f10, f11);
        path.lineTo(f12, f13);
        return path;
    }

    public static boolean d(g1.b bVar, Editable editable, int i, int i10, boolean z4) {
        int iMin;
        if (editable != null && i >= 0 && i10 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd) {
                if (z4) {
                    int iMax = Math.max(i, 0);
                    int length = editable.length();
                    if (selectionStart >= 0 && length >= selectionStart && iMax >= 0) {
                        loop0: while (true) {
                            boolean z10 = false;
                            while (true) {
                                if (iMax == 0) {
                                    break loop0;
                                }
                                selectionStart--;
                                if (selectionStart < 0) {
                                    if (!z10) {
                                        selectionStart = 0;
                                        break loop0;
                                    }
                                    break loop0;
                                }
                                char cCharAt = editable.charAt(selectionStart);
                                if (z10) {
                                    if (Character.isHighSurrogate(cCharAt)) {
                                        iMax--;
                                    }
                                } else if (!Character.isSurrogate(cCharAt)) {
                                    iMax--;
                                } else if (!Character.isHighSurrogate(cCharAt)) {
                                    z10 = true;
                                }
                                selectionStart = -1;
                                break loop0;
                            }
                        }
                    }
                    selectionStart = -1;
                    break loop0;
                    int iMax2 = Math.max(i10, 0);
                    iMin = editable.length();
                    if (selectionEnd >= 0 && iMin >= selectionEnd && iMax2 >= 0) {
                        loop2: while (true) {
                            boolean z11 = false;
                            while (true) {
                                if (iMax2 != 0) {
                                    if (selectionEnd >= iMin) {
                                        if (!z11) {
                                            break loop2;
                                        }
                                        break loop2;
                                    }
                                    char cCharAt2 = editable.charAt(selectionEnd);
                                    if (z11) {
                                        if (Character.isLowSurrogate(cCharAt2)) {
                                            iMax2--;
                                            selectionEnd++;
                                        }
                                    } else if (!Character.isSurrogate(cCharAt2)) {
                                        iMax2--;
                                        selectionEnd++;
                                    } else if (!Character.isLowSurrogate(cCharAt2)) {
                                        selectionEnd++;
                                        z11 = true;
                                    }
                                    iMin = -1;
                                    break loop2;
                                }
                                iMin = selectionEnd;
                                break loop2;
                            }
                        }
                    }
                    iMin = -1;
                    break loop2;
                    if (selectionStart != -1 && iMin != -1) {
                    }
                } else {
                    selectionStart = Math.max(selectionStart - i, 0);
                    iMin = Math.min(selectionEnd + i10, editable.length());
                }
                w[] wVarArr = (w[]) editable.getSpans(selectionStart, iMin, w.class);
                if (wVarArr != null && wVarArr.length > 0) {
                    for (w wVar : wVarArr) {
                        int spanStart = editable.getSpanStart(wVar);
                        int spanEnd = editable.getSpanEnd(wVar);
                        selectionStart = Math.min(spanStart, selectionStart);
                        iMin = Math.max(spanEnd, iMin);
                    }
                    int iMax3 = Math.max(selectionStart, 0);
                    int iMin2 = Math.min(iMin, editable.length());
                    bVar.beginBatchEdit();
                    editable.delete(iMax3, iMin2);
                    bVar.endBatchEdit();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.common.internal.s
    public /* bridge */ /* synthetic */ Object a(com.google.android.gms.common.api.s sVar) {
        return null;
    }

    @Override // q4.c
    public void e(Object obj) {
        ((List) obj).clear();
    }

    @Override // ka.c
    public ka.b f(b9.e eVar, JSONObject jSONObject) {
        return b(eVar);
    }

    public List g(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (x9.b bVar : componentRegistrar.getComponents()) {
            String str = bVar.f10315a;
            if (str != null) {
                bVar = new x9.b(str, bVar.f10316b, bVar.f10317c, bVar.f10318d, bVar.e, new e5.c(str, bVar, 18), bVar.f10320g);
            }
            arrayList.add(bVar);
        }
        return arrayList;
    }

    @Override // tb.a
    public Object get() {
        return new f3.b(Executors.newSingleThreadExecutor(), 1);
    }

    @Override // r6.b
    public int getAmount() {
        return 1;
    }

    @Override // r6.b
    public String getType() {
        return "";
    }

    @Override // a4.y
    public x i(e0 e0Var) {
        return new g0(e0Var.a(a4.n.class, InputStream.class), 1);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    @Override // la.a
    public StackTraceElement[] j(StackTraceElement[] stackTraceElementArr) {
        int i;
        HashMap map = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i10 = 0;
        int i11 = 0;
        int i12 = 1;
        while (i10 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i10];
            Integer num = (Integer) map.get(stackTraceElement);
            if (num == null) {
                stackTraceElementArr2[i11] = stackTraceElementArr[i10];
                i11++;
                i12 = 1;
                i = i10;
                break;
                break;
            }
            int iIntValue = num.intValue();
            int i13 = i10 - iIntValue;
            if (i10 + i13 <= stackTraceElementArr.length) {
                int i14 = 0;
                while (true) {
                    if (i14 >= i13) {
                        int iIntValue2 = i10 - num.intValue();
                        if (i12 < 10) {
                            System.arraycopy(stackTraceElementArr, i10, stackTraceElementArr2, i11, iIntValue2);
                            i11 += iIntValue2;
                            i12++;
                        }
                        i = (iIntValue2 - 1) + i10;
                        break;
                    }
                    if (!stackTraceElementArr[iIntValue + i14].equals(stackTraceElementArr[i10 + i14])) {
                        stackTraceElementArr2[i11] = stackTraceElementArr[i10];
                        i11++;
                        i12 = 1;
                        i = i10;
                        break;
                        break;
                    }
                    i14++;
                }
            } else {
                stackTraceElementArr2[i11] = stackTraceElementArr[i10];
                i11++;
                i12 = 1;
                i = i10;
                break;
            }
            map.put(stackTraceElement, Integer.valueOf(i10));
            i10 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i11];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i11);
        return i11 < stackTraceElementArr.length ? stackTraceElementArr3 : stackTraceElementArr;
    }

    @Override // d4.c0
    public void m(MediaExtractor mediaExtractor, Object obj) throws IOException {
        mediaExtractor.setDataSource(new b0((ByteBuffer) obj));
    }

    @Override // d4.c0
    public void o(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        mediaMetadataRetriever.setDataSource(new b0((ByteBuffer) obj));
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* bridge */ /* synthetic */ Object then(Task task) {
        return null;
    }

    @Override // i6.c
    public boolean zza(String str) {
        new b6.c(1, str).start();
        return true;
    }

    public d(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            new q0.y(view).f7964b = view;
        } else {
            new h0(view);
        }
    }
}

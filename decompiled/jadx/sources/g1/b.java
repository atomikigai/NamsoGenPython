package g1;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import androidx.emoji2.text.l;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f4163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wa.d f4164b;

    public b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        wa.d dVar = new wa.d();
        super(inputConnection, false);
        this.f4163a = editText;
        this.f4164b = dVar;
        if (l.f771j != null) {
            l lVarA = l.a();
            if (lVarA.b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            androidx.emoji2.text.f fVar = lVarA.e;
            fVar.getClass();
            Bundle bundle = editorInfo.extras;
            f1.b bVar = (f1.b) ((a3.j) fVar.f764c).f107a;
            int iA = bVar.a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", iA != 0 ? ((ByteBuffer) bVar.f3578d).getInt(iA + bVar.f3575a) : 0);
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i10) {
        Editable editableText = this.f4163a.getEditableText();
        this.f4164b.getClass();
        return wa.d.d(this, editableText, i, i10, false) || super.deleteSurroundingText(i, i10);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i10) {
        Editable editableText = this.f4163a.getEditableText();
        this.f4164b.getClass();
        return wa.d.d(this, editableText, i, i10, true) || super.deleteSurroundingTextInCodePoints(i, i10);
    }
}

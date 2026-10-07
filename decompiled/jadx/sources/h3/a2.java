package h3;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import app.namso_gen.spacehowen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a2 extends androidx.fragment.app.s {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public RecyclerView f4615f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public View f4616g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public n f4617h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final ub.i f4618i0 = new ub.i(new a2.d(this, 3));

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        jc.i.e(layoutInflater, "inflater");
        View viewInflate = layoutInflater.inflate(R.layout.fragment_notes, viewGroup, false);
        this.f4615f0 = (RecyclerView) viewInflate.findViewById(R.id.recyclerNotes);
        this.f4616g0 = viewInflate.findViewById(R.id.textNotesEmpty);
        this.f4617h0 = new n(new c(this, 1), (char) 0);
        RecyclerView recyclerView = this.f4615f0;
        yb.d dVar = null;
        if (recyclerView == null) {
            jc.i.i("recyclerView");
            throw null;
        }
        U();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        RecyclerView recyclerView2 = this.f4615f0;
        if (recyclerView2 == null) {
            jc.i.i("recyclerView");
            throw null;
        }
        n nVar = this.f4617h0;
        if (nVar == null) {
            jc.i.i("adapter");
            throw null;
        }
        recyclerView2.setAdapter(nVar);
        ((FloatingActionButton) viewInflate.findViewById(R.id.fabAddNote)).setOnClickListener(new com.google.android.material.datepicker.n(this, 11));
        rc.b0.q(androidx.lifecycle.i0.e(x()), null, new a2.x(this, dVar, 1), 3);
        return viewInflate;
    }

    public final void b0(i3.f fVar) {
        LayoutInflater layoutInflaterH = this.U;
        if (layoutInflaterH == null) {
            layoutInflaterH = H(null);
            this.U = layoutInflaterH;
        }
        View viewInflate = layoutInflaterH.inflate(R.layout.dialog_note, (ViewGroup) null);
        TextInputEditText textInputEditText = (TextInputEditText) viewInflate.findViewById(R.id.inputNoteContent);
        if (fVar != null) {
            textInputEditText.setText(fVar.f5171b);
        }
        Editable text = textInputEditText.getText();
        textInputEditText.setSelection(text != null ? text.length() : 0);
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(U(), R.style.MyDialogTheme).setTitle(v(fVar == null ? R.string.note_new : R.string.note_edit)).setView(viewInflate).setPositiveButton(v(R.string.btn_save), new n0(textInputEditText, this, fVar, 1)).setNegativeButton(v(R.string.btn_cancel), (DialogInterface.OnClickListener) null);
        if (fVar != null) {
            negativeButton.setNeutralButton(v(R.string.btn_delete), new z1(this, fVar, 0));
        }
        AlertDialog alertDialogCreate = negativeButton.create();
        alertDialogCreate.setOnShowListener(new p0(alertDialogCreate, 1));
        alertDialogCreate.show();
    }
}
